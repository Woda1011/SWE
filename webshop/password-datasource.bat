@ECHO OFF

REM
REM Algorithmus: Blowfish
REM Key:         jaas is the way
REM

SETLOCAL
SET CLASSPATH=%JBOSS_HOME%\modules\org\picketbox\main\*;%JBOSS_HOME%\modules\org\jboss\logging\main\*

SET /P PASSWORD="Password: "
java -cp %CLASSPATH% org.picketbox.datasource.security.SecureIdentityLoginModule %PASSWORD%

ENDLOCAL
PAUSE
