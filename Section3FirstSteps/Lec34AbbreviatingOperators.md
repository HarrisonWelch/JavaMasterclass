# Lec34AbbreviatingOperators

## Abbreviation
* `++` - can be used to quickly add 1
* `--` - can be used to quickly sub 1
* `+=` - cab be used to add and assign quickly
* `-=` - cab be used to sub and assign quickly
* `*=` - cab be used to mul and assign quickly
* `/=` - cab be used to div and assign quickly

## Code

```java
        //++
        // result = result + 1
        result++; // Abbr. op. 1 + 1 = 2
        System.out.println("1 + 1 = " + result);

        // Same with sub
        // result = result - 1;
        result--; // 2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        // +=
        // result = result * 2;
        result += 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        // *=
        // result = result * 10;
        result *= 10; // 3 * 10 = 30
        System.out.println("3 * 10 = " + result);

        // /=
        // result = result / 3;
        result /= 3; // 30 / 3 = 10
        System.out.println("30 / 3 = " + result);

        // -=
        // result = result / 3;
        result -= 2; // 10 / 2 = 8
        System.out.println("10 - 2 = " + result);
```
Output
```
1 + 1 = 2
2 - 1 = 1
1 + 2 = 3
3 * 10 = 30
30 / 3 = 10
10 - 2 = 8
```
