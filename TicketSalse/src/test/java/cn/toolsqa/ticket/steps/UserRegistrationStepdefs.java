package cn.toolsqa.ticket.steps;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.zh_cn.假如;
import cucumber.api.java.zh_cn.当;
import cucumber.api.java.zh_cn.而且;
import cucumber.api.java.zh_cn.那么;

public class UserRegistrationStepdefs {

    @假如("^小明童鞋还不是一位常旅客会员$")
    public void 小明童鞋还不是一位常旅客会员() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @当("^小明童鞋注册常旅客会员:$")
    public void 小明童鞋注册常旅客会员(DataTable arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
        throw new PendingException();
    }

    @那么("^注册成功后，小明童鞋的初始会员级别为'铜牌会员'$")
    public void 注册成功后_小明童鞋的初始会员级别为_铜牌会员() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
