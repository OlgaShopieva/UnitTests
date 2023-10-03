package seminar4;

import org.junit.jupiter.api.Test;
import ru.shopieva.seminar4.card.CreditCard;
import ru.shopieva.seminar4.card.PaymentForm;

import static org.mockito.Mockito.*;

public class PaymentFormTest {

    /**
     * 4.2. Используя библиотеку Mockito, напишите модульные тесты для проверки функциональности формы оплаты на сайте.
     * * Вместо реальной кредитной карты используйте мок-объект.
     * Создайте класс `CreditCard` с методами `getCardNumber()`, `getCardHolder()`, `getExpiryDate()`, `getCvv()`, `charge(double amount)`.
     * Создайте класс `PaymentForm` с методом `pay(double amount)`.
     * В тестовом классе, создайте мок-объект для класса `CreditCard`.
     * Определите поведение мок-объекта с помощью метода `when()`.
     * Создайте объект класса `PaymentForm`, передайте ему мок-объект в качестве аргумента.
     * Вызовите метод `pay()` и убедитесь, что мок-объект вызывает метод `charge()`
     */

    @Test
    void testCharge(){
        CreditCard card = mock(CreditCard.class);
        when(card.getCardHolder()).thenReturn("Ivan Ivanov");
        when(card.getCardNumber()).thenReturn("1234");
        when(card.getExpiryDate()).thenReturn("02/24");
        when(card.getCvv()).thenReturn("543");

        PaymentForm form = new PaymentForm(card);
        form.pay(1000);

        verify(card, times(1)).charge(1000);


}

}