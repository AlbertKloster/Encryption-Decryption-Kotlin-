# Stage 5/6: X-files
## Description
In this stage, add the ability to read and write the original and cipher data into files.

## Objectives
The program must parse two additional arguments `-in` and `-out` to specify the full name of a file to read the data and write the result. Arguments `-mode`, `-key`, and `-data` must work as before.

Your program should read data from `-data` or from a file specified in the `-in` argument. That's the reason why you can't have both `-data` and `-in` arguments simultaneously.

1. If there is no `-mode`, the program should work in the `enc` mode;
2. If there is no `-key`, the program should consider that `key` is `0`;
3. If there is no `-data` and no `-in` the program should assume that the data is an empty string;
4. If there is no `-out` argument, the program must print data to the standard output;
5. If there are both `-data` and `-in` arguments, your program should prefer `-data` over `-in`. 

If there is something strange (an input file does not exist, or an argument doesn't have a value), the program should not fail. Instead, it must display a clear message about the problem and stop successfully. The message should contain the word `Error`.

## Examples
<b>Example 1:</b> `reading and writing to files; the arguments are: -mode enc -in road_to_treasure.txt -out protected.txt -key 5`

`The program must get data from road_to_treasure.txt, encrypt the data with key 5, create a file called protected.txt, and write ciphertext to it.`

<b>Example 2:</b> `encryption; the arguments are -mode enc -key 5 -data "Welcome to hyperskill!"`
```
\jqhtrj%yt%m~ujwxpnqq&
```
<b>Example 3:</b> `decryption; the arguments are -key 5 -data "\jqhtrj%yt%m~ujwxpnqq&" -mode dec`
```
Welcome to hyperskill!
```