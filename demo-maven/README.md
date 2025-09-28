# Demo Maven + JUnit Project

A minimal Maven project with **multiple JUnit 5 tests**.

## Build & Test

```bash
mvn -q -v          # verify Maven is installed
mvn clean test
```

You should see all tests pass.

## Project Layout

```
demo
├── pom.xml
├── src
│   ├── main
│   │   └── java
│   │       └── com/example
│   │           ├── App.java
│   │           ├── Calculator.java
│   │           └── StringUtils.java
│   └── test
│       └── java
│           └── com/example
│               ├── AppTest.java
│               ├── CalculatorTest.java
│               └── StringUtilsTest.java
└── .gitignore
```

## Git quick start

```bash
git init
git add .
git commit -m "Initial commit: Maven project with multiple JUnit tests"
git branch -M main
git remote add origin https://github.com/YOUR_USERNAME/UnitTestWithMaven.git
git push -u origin main
```

## Jenkins (no Git repo, build from a local folder)

- **Freestyle Project**
  - *Build step*: Invoke top-level Maven targets
  - *Goals*: `clean test`
  - *POM*: `pom.xml`
  - *JDK/Maven Tool*: select the ones you configured under **Manage Jenkins → Tools**
- **Workspace**: Point the job's workspace to your local project folder on your Mac (e.g. `/Users/yourname/.jenkins/workspace/UnitTestWithMaven`).

