# Declarative Pipeline Lab - Simplified

A simple beginner-friendly lab to learn Jenkins declarative pipelines.

## What's Inside

- **Sample.java** - One simple method: `add(a, b)`
- **SampleTest.java** - 3 simple tests
- **Jenkinsfile** - 3 basic pipeline stages: Build, Test, Success
- **pom.xml** - Maven configuration

## Quick Start

### Prerequisites

```bash
# Check Java
java -version

# Check Maven  
mvn -version

# Check Git
git --version
```

If anything is missing on Ubuntu:
```bash
sudo apt update
sudo apt install openjdk-17-jdk maven git
```

### Build Locally

```bash
# Navigate to project folder
cd DeclarativePipelineLab

# Build
mvn clean package

# Run tests
mvn test
```

## Jenkins Setup (5 Minutes)

### 1. Install Jenkins
```bash
# Install
sudo apt install jenkins

# Start
sudo systemctl start jenkins

# Open browser: http://localhost:8080
# Get password: sudo cat /var/lib/jenkins/secrets/initialAdminPassword
```

### 2. Create Pipeline Job
1. Click **"New Item"**
2. Name: `SimplePipeline`
3. Select **"Pipeline"** → Click **"OK"**

### 3. Configure Job
- Scroll to **"Pipeline"** section
- Select **"Definition"** → **"Pipeline script"**
- Copy the `Jenkinsfile` content from this folder into the text box
- Click **"Save"**

### 4. Run Pipeline
1. Click **"Build Now"**
2. Click the build number to see output
3. Click **"Console Output"** to watch it run

## Expected Output

```
Building the project...
Running tests...
✓ Build and tests completed successfully!
```

## File Explanations

**Sample.java** - Simple addition method
**SampleTest.java** - Tests the addition method
**Jenkinsfile** - 3 stages that build and test
**pom.xml** - Maven setup (Java 17, JUnit 5)

## Next Steps

Once this works:
1. Add another method to `Sample.java`
2. Add a test for it in `SampleTest.java`
3. Push to GitHub and watch Jenkins rebuild automatically

## Troubleshooting

**"mvn: command not found"**
```bash
sudo apt install maven
```

**Tests don't run**
- File must be named `*Test.java`
- Make sure it has `@Test` annotations

**Jenkins can't find Jenkinsfile**
- Make sure it's in the root folder
- Check the branch name (main vs master)

## Resources

- Jenkins Docs: https://www.jenkins.io/doc/
- Maven Docs: https://maven.apache.org/

