javac -sourcepath src;Tests -d bin -cp ".\ext\*" .\src\iSAFE\TestDriver.java .\Tests\TestCases\TestCases.java


java -cp "bin;.\ext\*" iSAFE.TestDriver

pause