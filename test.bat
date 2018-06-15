@echo off
setlocal

set month=11
set result=
if %month% EQU 1 (
set result= January
) else if  %month% EQU 2 (
set result= February
) else if  %month% EQU 3 (
set result= March
) else if  %month% EQU 4 (
set result= April
) else if  %month% EQU 5 (
set result= May
) else if  %month% EQU 6 (
set result= June
) else if  %month% EQU 7 (
set result= July
) else if  %month% EQU 8 (
set result= August
) else if  %month% EQU 9 (
set result= September
) else if  %month% EQU 10 (
set result= October
) else if  %month% EQU 11 (
set result= November
) else if  %month% EQU 12 (
set result= December
) else (
set result= err
exit
)
echo %result%
endlocal
pause
