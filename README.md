# diamond-kata

Diamond kata excercise implemented in clojure

## Tests

```
$ lein test

lein test diamond-kata.core-test

Ran 1 tests containing 3 assertions.
0 failures, 0 errors.
```

## Example

from:

```
$ lein run 0
A
```

to

```
$ lein run 4
    A
   B B
  C   C
 D     D
E       E
 D     D
  C   C
   B B
    A
```

to

```
$ lein run 25
                         A
                        B B
                       C   C
                      D     D
                     E       E
                    F         F
                   G           G
                  H             H
                 I               I
                J                 J
               K                   K
              L                     L
             M                       M
            N                         N
           O                           O
          P                             P
         Q                               Q
        R                                 R
       S                                   S
      T                                     T
     U                                       U
    V                                         V
   W                                           W
  X                                             X
 Y                                               Y
Z                                                 Z
 Y                                               Y
  X                                             X
   W                                           W
    V                                         V
     U                                       U
      T                                     T
       S                                   S
        R                                 R
         Q                               Q
          P                             P
           O                           O
            N                         N
             M                       M
              L                     L
               K                   K
                J                 J
                 I               I
                  H             H
                   G           G
                    F         F
                     E       E
                      D     D
                       C   C
                        B B
                         A
```

And beyond!!!

```
$ lein run 36
                                    A
                                   B B
                                  C   C
                                 D     D
                                E       E
                               F         F
                              G           G
                             H             H
                            I               I
                           J                 J
                          K                   K
                         L                     L
                        M                       M
                       N                         N
                      O                           O
                     P                             P
                    Q                               Q
                   R                                 R
                  S                                   S
                 T                                     T
                U                                       U
               V                                         V
              W                                           W
             X                                             X
            Y                                               Y
           Z                                                 Z
          [                                                   [
         \                                                     \
        ]                                                       ]
       ^                                                         ^
      _                                                           _
     `                                                             `
    a                                                               a
   b                                                                 b
  c                                                                   c
 d                                                                     d
e                                                                       e
 d                                                                     d
  c                                                                   c
   b                                                                 b
    a                                                               a
     `                                                             `
      _                                                           _
       ^                                                         ^
        ]                                                       ]
         \                                                     \
          [                                                   [
           Z                                                 Z
            Y                                               Y
             X                                             X
              W                                           W
               V                                         V
                U                                       U
                 T                                     T
                  S                                   S
                   R                                 R
                    Q                               Q
                     P                             P
                      O                           O
                       N                         N
                        M                       M
                         L                     L
                          K                   K
                           J                 J
                            I               I
                             H             H
                              G           G
                               F         F
                                E       E
                                 D     D
                                  C   C
                                   B B
                                    A

```

## License

Copyright © 2016 Crispin Wellington

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
