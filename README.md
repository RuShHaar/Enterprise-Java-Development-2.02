### Review of Lab 2.02 (Tim Acosta):

Hiweis: packages immer klein geschrieben, also "classes" und nicht "Classes". Methoden auch.

1 - Integer getOdds - Perfekt

2- Keywords- Funktioniert alles, ausser dass deine Methode nicht erkennt ob das Keyword einzel oder Teil eines anderen Wortes ist.
Eine Form die auch andere der Bootcampen benutzt haben ist das Keyword entweder mit Leerzeichen zu umhüllen oder ein ein Array aus dem input zu machen. Hier ein Beispiel

 ```java
 
 public boolean isForbidden(String sentence) {
         String[] individualWords = sentence.split(" ");
         boolean isIn = false;
         for (int i = 0; i < individualWords.length; i++) {
             if (Arrays.asList(keywords).contains(individualWords[i])) {
                 isIn = true;
                 break;
             }
         }
         return isIn;
     }

 ```

