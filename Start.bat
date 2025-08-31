@echo off
chcp 65001 > nul
title Pix 12.000

set JAR_PATH1="D:\intellij\projects\pix_dicks_soft\build\libs\pix.dicks.software-0.1sm.jar"
set JAR_PATH2="D:\intellij\projects\pix_dicks_soft\build\libs\pix.jar"
set JAR_PATH3="pix.dicks.software-0.1sm.jar"

echo ===============================
echo    ПИКСА ЕБАТЕЛЬ 12.000
echo ===============================

if exist %JAR_PATH1% (
    echo Запуск: %JAR_PATH1%
    java -Dfile.encoding=UTF-8 -jar %JAR_PATH1%
) else if exist %JAR_PATH2% (
    echo Запуск: %JAR_PATH2%
    java -Dfile.encoding=UTF-8 -jar %JAR_PATH2%
) else if exist %JAR_PATH3% (
    echo Запуск: %JAR_PATH3%
    java -Dfile.encoding=UTF-8 -jar %JAR_PATH3%
) else (
    echo ОШИБКА: JAR файл не найден!
    echo.
    echo Возможные пути:
    echo %JAR_PATH1%
    echo %JAR_PATH2%
    echo %JAR_PATH3%
    echo.
    echo Собери проект: gradlew jar
)

echo.
echo | =============================== |
pause