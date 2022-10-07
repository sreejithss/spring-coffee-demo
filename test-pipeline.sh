#!/bin/bash
set -euo pipefail
cd ${0%/*}

echo Cleaning results directory
rm -Rf allure-results/

echo Executing unit tests
mvn test || true

echo Executing integration tests
mvn test-compile failsafe:integration-test failsafe:verify || true

echo Uploading test results
allurectl upload --project-id=2 --launch-name "Launch at $(date -u +'%F %R')" allure-results
