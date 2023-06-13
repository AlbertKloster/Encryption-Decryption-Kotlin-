# Stage 4/6: I command you
## Description
Modify the previous program to work with command-line arguments instead of the standard input.

You need to put it in quotes to pass an argument that contains spaces as a single argument. So `Welcome to hyperskill!` becomes a single `Welcome to hyperskill!` argument without quotes. You need quotes to pass this argument, but you don't need to remove these quotes in the actual code!

## Objectives
The program must parse three arguments: `-mode`, `-key`, and `-data`. The first argument should determine the program's mode (enc for encryption, dec for decryption). The second argument is an integer key to modify the message, and the third is a text or ciphertext to encrypt/decrypt.

Arguments are guaranteed to be passed to the program. If, for some reason, they turn out to be wrong:

1. If there is no `-mode`, the program should work in the enc mode;
2. If there is no `-key`, the program should consider that it is `0`;
3. If there is no `-data`, the program should assume that `data` is an empty string.
Keep in mind that the order of the arguments might be different. For example, -mode enc maybe at the end, at the beginning, or in the middle of the array.

## Examples
<b>Example 1:</b> `encryption; the arguments are: -mode enc -key 5 -data "Welcome to hyperskill!"`
```
\jqhtrj%yt%m~ujwxpnqq&
```
<b>Example 2:</b> `decryption; the arguments are: -key 5 -data "\jqhtrj%yt%m~ujwxpnqq&" -mode dec`
```
Welcome to hyperskill!
```
