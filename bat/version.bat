@echo off
rem Windowsのversion確認
rem echo 機能を切る

rem バッチのディレクトリを取得
cd /d %~dp0

rem コマンドプロンプト起動時のタイトルを設定する
title CheckWindowsVersion

rem 存在確認
if exist Version.bat (
    ver > ProcessResult.txt
) else (
    echo nothing
)

rem 結果報告
echo 処理が終了しました。ファイルを確認してください。
pause >nul
