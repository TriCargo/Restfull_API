### `mvn spring-boot:run`

Runs the app in the development mode.\
Open [http://localhost:8080](http://localhost:8080) to view it in your browser.

The application will reload when you make changes.\
You may also see any errors in the console.

### `mvn test`

Launches the test runner in the interactive watch mode.\
See the section about [running tests](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#howto-use-spring-boot-testing) for more information.

### `mvn clean install`

Builds the app and installs it into your local repository.\
This command compiles, tests, and packages the app, making it ready for deployment.

The app is now ready to be deployed to production.

### `mvn package`

Builds the app for production to the `target` folder.\
It correctly bundles the app in production mode and optimizes the build for the best performance.

The build is minified and the filenames include the hashes.\
Your app is ready to be deployed!

### `mvn spring-boot:build`

**Note: this is a one-way operation. Once you `build`, you can't go back!**

If you aren't satisfied with the build tool and configuration choices, you can `build` at any time. This command will remove the single build dependency from your project.

Instead, it will copy all the configuration files and the transitive dependencies (Spring Boot, Spring Data JPA, etc.) right into your project so you have full control over them. All of the commands except `build` will still work, but they will point to the copied scripts so you can tweak them. At this point, you're on your own.

You don't have to ever use `build`. The curated feature set is suitable for small and middle deployments, and you shouldn't feel obligated to use this feature.
