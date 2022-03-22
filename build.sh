#!/bin/bash
set -euo pipefail
cd ${0%/*}

mvn clean install

docker build -t coffee-demo .