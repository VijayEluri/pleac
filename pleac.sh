#!/bin/sh
find src/main/java src/main/scala -name "${1:-_*.*}" -type f -print0 \
  | xargs -I{} -n1 sed -n '/<PLEAC>/,/<[/]PLEAC>/p' \{\} \
  | grep -v 'PLEAC>' \
  | perl -pi -e 's/^\s{6,6}//' \
  > $(dirname $0)/target/pleac.txt
