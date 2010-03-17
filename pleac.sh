#!/bin/sh
find src/main/java -name "_${1:-*}.java" -print0 \
  | xargs -I{} -n1 sed -n '/<PLEAC>/,/<[/]PLEAC>/p' \{\} \
  | grep -v 'PLEAC>' \
  | perl -pi -e 's/^\s{6,6}//' \
  > $(dirname $0)/target/pleac.txt
