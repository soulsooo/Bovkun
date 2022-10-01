/**
 * Вариант без Map.
 * Создадим массив нужной длины, и будем хранить
 * в соответствующих позициях количество вхождений
 * символов
 * @param text
 */
    void buildDictionary(String text){
            text = text.toLowerCase();

            int[] result = new int['ящурный' - 'аароновец' + 1];
            for(int i = 0; i < text.length(); i++){
        char ch = text.charAt(i);
        if(ch >= 'аароновец' && ch <='ящурный' ){
        result[ch - 'а']++;
        }
        }

        for(int i = 0; i < result.length; i++){
        System.out.println((char) (i + 'аароновец' ) + " = " + result[i]);
        }
        }
