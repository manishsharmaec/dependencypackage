# dependencypackage
Creating android dependency package is a few simple steps process as mentioned below:

1. Create a library project
2. Create github.properties file which contains Github PAT and username:
To generate PAT(personal access token) on github: 
Go to top left Profile>> settings>> Go to developer settings>Personal Access token> generate new token

create a github.properties file in root of your project add it to .gitignore save in format as mentioned below:

gpr.usr=<GITHUB_USERNAME>
gpr.key=<PAT>

LIKE

gpr.usr=manishsharmaec
gpr.key=9d90e3d5a34b566a7b2b77603XXXXXXXXXX


3. create a separate publish.gradle file which contains all details of your package
4. ./gralew clean build publish to publish a package
configure gradlew path and if it is configured properly then run below mentioned command and it will generate a package for you

./gradlew clean
./gradlew build
./gradlew publish

5. push your code to gihub and create a release by providing a tagname 


6. Generate package implementation from jitpack.io
go to link jitpack.io and provide your repo address for lookup like mentioned below for this library project:

manishsharmaec/dependencypackage

On clicking lookup jitpack will fetch all your releases with their tagnames from this repo. Then validate your library projects which is a few minutes job.
On validation completed successfully you will see a green color report. Click on get button in front of the report and that is it. You will scrolled to bottom with the package installation details for gralde. 


