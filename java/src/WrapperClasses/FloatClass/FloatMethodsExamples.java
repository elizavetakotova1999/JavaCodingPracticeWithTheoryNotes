package WrapperClasses.FloatClass;

public class FloatMethodsExamples {

        public static void main(String[] args) {
            float value1 = 3.14f;
            float value2 = 2.5f;

            // 1. floatToRawIntBits() - повертає представлення числа типу float у вигляді цілого числа (без перетворень)
            int rawIntBits = Float.floatToRawIntBits(value1);
            System.out.println("Raw int bits: " + rawIntBits);

            // 2. floatToIntBits() - повертає представлення числа типу float у вигляді цілого числа (зі збереженням знаку)
            int intBits = Float.floatToIntBits(value1);
            System.out.println("Int bits: " + intBits);

            // floatValue() - повертає значення типу float
            float floatValue = Float.valueOf(value1).floatValue();
            System.out.println("Float value: " + floatValue);

            //doubleValue() - повертає значення типу double
            double doubleValue = Float.valueOf(value1).doubleValue();
            System.out.println("Double value: " + doubleValue);

            //byteValue() - повертає значення типу byte
            byte byteValue = Float.valueOf(value1).byteValue();
            System.out.println("Byte value: " + byteValue);

            //shortValue() - повертає значення типу short
            short shortValue = Float.valueOf(value1).shortValue();
            System.out.println("Short value: " + shortValue);

            // intValue() - повертає значення типу int
            int intValue = Float.valueOf(value1).intValue();
            System.out.println("Int value: " + intValue);

            // longValue() - повертає значення типу long
            long longValue = Float.valueOf(value1).longValue();
            System.out.println("Long value: " + longValue);

            // compareTo() - порівнює два значення типу float
            int compareResult = Float.valueOf(value1).compareTo(value2);
            System.out.println("Compare result: " + compareResult);

            // equals() - порівнює два значення типу float на рівність
            boolean equalsResult = Float.valueOf(value1).equals(value2);
            System.out.println("Equals result: " + equalsResult);

            // 3. isNaN() - перевіряє, чи є значення типу float "не число" (NaN)
            boolean isNaN = Float.isNaN(value1);
            System.out.println("Is NaN: " + isNaN);

            // 4. isInfinite() - перевіряє, чи є значення типу float "безкінечністю" (Infinity або -Infinity)
            boolean isInfinite = Float.isInfinite(value1);
            System.out.println("Is Infinite: " + isInfinite);

            // 5. isFinite() - перевіряє, чи є значення типу float скінченним (не NaN і не безкінечність)
            boolean isFinite = Float.isFinite(value1);
            System.out.println("Is Finite: " + isFinite);

            //6. toString() - повертає рядкове представлення значення типу float
            String floatString = Float.toString(value1);
            System.out.println("Float string: " + floatString);

            // 7. toHexString() - повертає рядкове представлення значення типу float у вигляді шістнадцяткового числа
            String hexString = Float.toHexString(value1);
            System.out.println("Hex string: " + hexString);


            // 8. parseFloat() - парсить рядок у значення типу float
            float parsedFloat = Float.parseFloat("3.14");
            System.out.println("Parsed float: " + parsedFloat);

            // 9.valueOf() - повертає об'єкт типу Float з вказаним значенням
            Float floatValueObj = Float.valueOf(value1);
            System.out.println("Float value object: " + floatValueObj);

            //10.  sum() - обчислює суму двох значень типу float
            float sum = Float.sum(value1, value2);
            System.out.println("Sum: " + sum);

            //11. max() - повертає більше з двох значень типу float
            float max = Float.max(value1, value2);
            System.out.println("Max value: " + max);

            //12. min() - повертає менше з двох значень типу float
            float min = Float.min(value1, value2);
            System.out.println("Max value: " + min);

            //13. intBitsToFloat() - повертає значення типу float з заданого цілого числа
            float bitsToFloat = Float.intBitsToFloat(intBits);
            System.out.println("Float value: " + bitsToFloat);

            //14. hashCode() - повертає хеш-код для об'єкта типу Float
            Float floatObj = Float.valueOf(floatValue);
            int hashCode = floatObj.hashCode();
            System.out.println("Hash code: " + hashCode);

            //15. compare() - порівнює два значення типу float, повертає від'ємне число,
            // якщо перше менше, позитивне - якщо більше і нуль, якщо рівні
            int compare = Float.compare(value1, value2);
            System.out.println("Compare result: " + compare);

        }
    }


