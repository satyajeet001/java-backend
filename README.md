# MyTemporalApp
## Overview
MyTemporalApp is a Java project leveraging Temporal Workflow for orchestrating tasks and Zulu Java 21 JDK for compatibility. It utilizes Gradle as a build tool for managing dependencies and building the project.

## Prerequisites
Before you begin, ensure you have the following installed:

- Zulu Java 21 JDK
- Gradle
- Temporal Server

## Zulu JDK 21
Zulu JDK is a build of OpenJDK, an open-source implementation of the Java Platform. Zulu JDK 21, the version mentioned in this project, provides the latest features, security updates, and performance improvements for Java developers. It ensures compatibility with Java SE standards and offers long-term support.

## Temporal
Temporal is an open-source framework for building resilient, scalable, and distributed applications. It simplifies the development of complex workflows and helps manage the execution of asynchronous tasks. Temporal is designed to handle long-running processes, providing fault tolerance and the ability to recover from failures gracefully.

In the context of this project, Temporal is used to orchestrate tasks related to user account creation, integrating seamlessly with other components of the application.
<img width="953" alt="temporal_setup" src="https://github.com/satyajeet001/java-backend/assets/99283330/b47a0124-2a21-4535-902c-218e88c3dc72">
<img width="955" alt="Temporal start dev" src="https://github.com/satyajeet001/java-backend/assets/99283330/e3d2d48f-42f9-4b35-a630-a7c3c6693cd9">

## Gradle
Gradle is a powerful build automation tool that supports multiple languages and platforms. It uses a Groovy-based domain-specific language (DSL) or Kotlin for scripting. Gradle simplifies the build process, managing dependencies, and allows developers to express the structure of their software projects easily.

In this project, Gradle is used to manage dependencies, build the project, and run tasks such as bootRun to execute the Spring Boot application.

<img width="353" alt="gradle run" src="https://github.com/satyajeet001/java-backend/assets/99283330/0eab96f9-b9d4-4df0-b133-52165cfb309d">
<img width="959" alt="bootrun" src="https://github.com/satyajeet001/java-backend/assets/99283330/fd8167e4-08a5-4aa2-bfe8-6ac4023e9b31">

## Stripe
Stripe is a popular payment processing platform that provides APIs and tools for businesses to accept and manage online payments. It supports various payment methods, subscriptions, and additional features for managing customer data securely.

In the context of this project, Stripe is integrated to handle customer creation upon user signup. The project uses the Stripe API and SDK to interact with the Stripe platform, creating a seamless experience for handling payments and customer data.

These technologies, combined, create a robust and modern development stack for building scalable, distributed applications with efficient workflow management and payment processing capabilities.
<img width="947" alt="CustomerID" src="https://github.com/satyajeet001/java-backend/assets/99283330/1ff49410-a51a-4ae1-9cc2-fc78821440d7">

The modifications to the code include injecting the `CreateAccountWorkflow` dependency into the `AccountController` to initiate Temporal workflows for user account creation. In the `createUserAccount` method, the Temporal workflow is invoked to create a new user account, utilizing the `Mapper` class for data conversion. The `createAccount` method in the `CreateAccountWorkflow` interface orchestrates the account creation process, including invoking the Stripe API to create a customer. The `CreateAccount` class now includes fields for user details required for account creation. Additionally, a detailed README.md file was created, outlining project setup, dependencies (such as Zulu JDK 21, Temporal, Gradle, and Stripe), installation instructions, and usage guidelines.
