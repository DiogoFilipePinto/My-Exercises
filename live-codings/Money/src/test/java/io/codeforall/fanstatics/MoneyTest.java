package io.codeforall.fanstatics;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import junitparams.converters.Nullable;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class MoneyTest {

    @Test
    @Parameters({"10, EUR", "20, USD", "50, YEN"})
    public void constructorShouldSetAmountAndCurrencyTest(int amount, String currency){

        //Setup & Exercise
        Money money = new Money(amount,currency);

        //Verify
        Assert.assertEquals(amount, money.getAmount());
        Assert.assertEquals(currency,money.getCurrency());
    }

    @Test(expected = IllegalArgumentException.class)
    @Parameters({"-5" , "0" , "-75"})
    public void constructorInvalidAmountLogicTest (int invalidAmount) {
        new Money(invalidAmount, "EUR");
    }

    @Test(expected = IllegalArgumentException.class)
    @Parameters({"" , " " , "null"})
    public void constructorShouldThrowExceptionInvalidCurrency(@Nullable String invalidCurrency){
        new Money(10, invalidCurrency);
    }





}
