[![Build Status](https://travis-ci.org/iamironz/binaryprefs.svg?branch=master)](https://travis-ci.org/iamironz/binaryprefs)

## Binary Preferences

Implementation of SharedPreferences which stores each preference in files
separately and performs disk IO via NIO2 with memory mapped file.

## Roadmap

1. ~~Disk I/O encrypt~~ completed
2. IPC
3. Externalizable (acyclic graph)
4. ~~Preferences tooling (key set reading)~~ completed

## License
```
Copyright 2017 Alexander Efremenkov

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
```
