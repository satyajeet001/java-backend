@Controller
@RequiredArgsConstructor
public class AccountController implements AccountsApi {
  
  private final CreateAccountWorkflow createAccountWorkflow; // Add Temporal workflow stub
  private final Logger logger = LoggerFactory.getLogger(AccountController.class);

  /**
   * POST /accounts : Create a new user account Creates a new user account with the given details
   * and attaches a supported payment provider such as 'stripe'.
   *
   * @param createAccountDto User account details (required)
   * @return User account created (status code 201)
   */
  @Override
  public ResponseEntity<AccountDto> createUserAccount(CreateAccountDto createAccountDto) {
    logger.info("Creating account for user with email: {}", createAccountDto.getEmail());

    // Initiate the Temporal workflow
    CreateAccountWorkflow workflow = Workflow.newWorkflowStub(CreateAccountWorkflow.class);
    CreateAccount createAccountDetails = Mapper.toCreateAccount(createAccountDto);
    Account account = workflow.createAccount(createAccountDetails);

    return new ResponseEntity<>(Mapper.toAccountDto(account), HttpStatus.CREATED);
  }

  /**
   * GET /accounts : Get list of user accounts Returns a list of user accounts.
   *
   * @return List of user accounts (status code 200)
   */
  @Override
  public ResponseEntity<List<AccountDto>> getUserAccounts() {
    logger.info("Retrieving all accounts");

    // Retrieve accounts using your existing service
    var accounts = accountService.getAccounts();
    var accountsDto = accounts.stream().map(Mapper::toAccountDto).toList();

    return new ResponseEntity<>(accountsDto, HttpStatus.OK);
  }
}
