# Lec53UsingDiffMerge

## Diff Merge
* Use the folder button in the top left
* Make the left folder your correct (more correct) solution
* Make the right folder your target solution
* Diff Merge will highlight all changes in all files recursively between both folders
* Diff Merge will detect (most of the time) that a file has been changed outside of the program.
  * Reload the folder(s)
* "Apply from change from left" is a button in the top row
  * It will adjust the right window to match the left
  * Black bars will be placed on the changed code on the right
  * Changes have not yet been made

## Filtering
* You can filter out some files to avoid useless info
* `*.class` files are compiled java files
* Under Tools / Options you will see "Folder Windows"
* In the "Use file name filters"
  * Make sure the box is checked
  * Add `*.class` to avoid diffmerge from checking files it doesn't need to
* Under subfolder filters place `.idea` in there to avoid any child files and the directory from being diffmerge compared.

Example:
```java
        } else if (playerScore >= 100); { // <-- Introduced an error
            position = 3;
        }
```
This caused all output to say positon 3 b/c `position = 3;` is a code block without a condition

output
```
Mary managed to get into position 3 on the high score table
Rashad managed to get into position 3 on the high score table
Z managed to get into position 3 on the high score table
Xylophone managed to get into position 3 on the high score table
Louise managed to get into position 3 on the high score table
Marshall managed to get into position 3 on the high score table
Crystal managed to get into position 3 on the high score table
```
