## MTG-Web

A Spring boot application for tracking EDH game statistics.

This project uses Spring Boot and gradle to package the application into a war file that can be run from any host.

To build the project run `./gradlew build` on linux/gitbash or `gradlew.bat` on a windows commandline.

You can run the built war file using `java -jar mtg-web-${version}`

To debug builds use `./gradlew bootRun` or `gradlew.bat bootRun`