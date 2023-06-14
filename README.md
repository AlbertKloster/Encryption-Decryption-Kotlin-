# Stage 6/6: Choice, choice
## Description
Extend your program by adding different algorithms for encoding/decoding. The first one is the shifting algorithm — it shifts each letter by the specified number according to its order in the alphabet. The second one is based on the Unicode table, like in the previous stage.

## Objectives
When starting the program, the necessary algorithm should be specified by an argument (`-alg`). Name the first algorithm as shift, the second one as `unicode`. If there is no `-alg` argument, default it to `shift`.

Remember that in case of `shift`, encode only English letters — from "a" to "z" and from "A" to "Z". In other words, after "z" comes "a", after "Z" comes "A".

## Examples
<b>Example 1:</b> <i>reading and writing to files; the arguments are: -mode enc -in road_to_treasure.txt -out protected.txt -key 5 -alg unicode</i>

<i>This command must get data from road_to_treasure.txt, encrypt the data with the key of 5, create protected.txt, and write ciphertext into it.</i>

<b>Example 2:</b> <i>encryption with the unicode algorithm; the arguments are: -mode enc -key 5 -data "Welcome to hyperskill!" -alg unicode</i>
```
\jqhtrj%yt%m~ujwxpnqq&
```
<b>Example 3:</b> <i>decryption with the unicode algorithm; the arguments are: -key 5 -alg unicode -data "\jqhtrj%yt%m~ujwxpnqq&" -mode dec</i>
```
Welcome to hyperskill!
```
<b>Example 4:</b> <i>encryption with the shift algorithm; the arguments are: -key 5 -alg shift -data "Welcome to hyperskill!" -mode enc</i>
```
Bjqhtrj yt mdujwxpnqq!
```
<b>Example 5:</b> <i>decryption with the shift algorithm; the arguments are: -key 5 -alg shift -data "Bjqhtrj yt mdujwxpnqq!" -mode dec</i>
```
Welcome to hyperskill!
```
