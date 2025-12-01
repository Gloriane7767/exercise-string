# Working with Strings.

## Exercises:

### Question 1.
What is the length of the String: "Java" ?

### Algorithm

- Start the program.

- Define a string variable str with value "Java".

- Measure the length of str.

- Print the length.

- End the program

### Pseudocode

```pgsql

START
   SET str = "Java"

   SET length = LENGTH(str)

   PRINT "Length of the string is: ", length

END
```

### Flowchart

mermaid  

flowchart TD

```
    A([START]) --> B[Set str = "Java"]

    B --> C[Set length = LENGTH(str)]

    C --> D[PRINT "Length of the string is: " + length]

    D --> E([END])
```


### Question 2.

What char is at index position 6 in the following String:
"Long example sentence" ?

- Start

- Store the string → "Long example sentence"

- Directly read the character at index position 6

- Output that character

- End

### Pseudocode

```pgsql
START

SET text = "Long example sentence"

SET character = text[6]

PRINT "Character at index 6 is: ", character

END
```

### Flowchart 

mermaid

flowchart TD

```

    A([START]) --> B["text = 'Long example sentence'"]

    B --> C["character = text[6]"]

    C --> D["PRINT character"]

    D --> E([END])
```
