package com.dsa;
class DuplicateCharacters {
    public static void main(String[] args) {

        String str = "programming";

        for(int i = 0; i < str.length(); i++) {

            int count = 1;

            for(int j = i + 1; j < str.length(); j++) {

                if(str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }

            if(count > 1) {

                boolean alreadyPrinted = false;

                for(int k = 0; k < i; k++) {

                    if(str.charAt(i) == str.charAt(k)) {
                        alreadyPrinted = true;
                    }
                }

                if(!alreadyPrinted) {
                    System.out.println(str.charAt(i));
                }
            }
        }
    }
}