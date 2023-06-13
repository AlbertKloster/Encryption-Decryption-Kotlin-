# Stage 3/6: Decrypted
## Description
In this stage, you need to include decryption into your program. Decryption is simply the inverse of encryption, following the same steps but reversing the order in which the keys are applied.

## Objectives
Write a program that reads three lines from the standard input: a target operation (`enc` for encryption, `dec` for decryption), a message or a ciphertext, and a key to encrypt/decrypt messages. All non-letter characters should be encrypted as well as regular letters. We recommend you get an integer representation of each character (according to the Unicode table) to shift it.

Decompose your program using functions to make it easy to understand and edit later. One method should encrypt a message and another one should decrypt it according to a key.

## Examples
The greater-than symbol followed by a space (`> `) represents the user input. Note that it's not part of the input.

### Example 1: encryption
```
> enc
> Welcome to hyperskill!
> 5
\jqhtrj%yt%m~ujwxpnqq&
```

### Example 2: decryption
```
> dec
> \jqhtrj%yt%m~ujwxpnqq&
> 5
Welcome to hyperskill!
```