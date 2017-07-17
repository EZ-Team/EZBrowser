# POWERSHELL SCRIPT
# MAINTENER MAXIME PELTE

# Install tools for web app

#Set-Location .\EZBrowser\

#Write-Output "Downloading dependencies..."
#npm install @angular/cli
#npm install 

#Set-Location ../

# Build the server jar 
Write-Output "Building API jar..."
Set-Location .\EZStudioApi\
./gradlew build 

Write-Output "Build done!"

Set-Location ../

# Build Angular web app
Write-Output "Building Angular app..."
Set-Location .\EZBrowser-Webapp\
ng build

Write-Output "Build done!"

Set-Location ../

# Run api and web app through docker-compose
Write-Output "Run api & web app with docker-compose"

docker-compose build
docker-compose up

