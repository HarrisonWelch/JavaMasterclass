# Lecture 142 Packages

You can fully qualify Java code

```java
package com.company;

public class Main {

    public static void main(String[] args) {
        javafx.scene.Node node = null;
    }
}
```

You can control imports and fully qualified names

```java
package com.company;

import javafx.scene.Node;
import org.w3c.dom.Node;

public class Main {

    public static void main(String[] args) {
        javafx.scene.Node node = null;
        org.w3c.dom.Node node2 = null;
    }
}
```

## Packages
Some reasons to use packages are:
* Programmers can easily determine that the classes are related.
* It is easy to know where to find the classes and interfaces that can provide the functions provided by the package.
* Because the package creates a new namespace, class, and interface name 
* Conflicts are avoided
* Classes within the package can have unrestricted access to one another while still restricting access for classes outside the package.

### Back to code
* We have been using code this whole time such as Scanner
* Or ArrayList
* Impossible to use java without one package

### AWT: Abstract Window Toolkit
* Make a quick GUI in a diff class (not a diff package)
