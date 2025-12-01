# Working with Strings.
## Exercises:

### Question 1.
What is the length of the String: "Java" ?

### Algorithm
- Start
- Define a String -> `Java`
- Define a printMethod -> `System.out.println(ex1.length());`
- End

  ### Pseudocode

```pgsql

START
SET text = "Java"
PRINT System.out.println(ex1.length());

END
```

### Flowchart

flowchart TD

   
    A([START]) --> B[text = "Java"\ncount = 0\nindex = 0]

    B --> C{Is index < length of text?}

    C -->|Yes| D[count = count + 1\nindex = index + 1]
    D --> C

    C -->|No| E[PRINT count]

    E --> F([END])

