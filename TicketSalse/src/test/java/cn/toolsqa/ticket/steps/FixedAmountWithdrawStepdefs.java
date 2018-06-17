package cn.toolsqa.ticket.steps;

import cucumber.api.java.zh_cn.假如;
import cucumber.api.java.zh_cn.当;
import cucumber.api.java.zh_cn.而且;
import cucumber.api.java.zh_cn.那么;

public class FixedAmountWithdrawStepdefs {
    @那么("^我应该收到现金\"([^\"]*)\"元$")
    public void 我应该收到现金_元(String accountBalance) throws Throwable {
    }

    @假如("^我的账户中有余额\"([^\"]*)\"元$")
    public void 我的账户中有余额_元(String withdrawAmount) throws Throwable {
    }

    @当("^我选择固定金额取款方式取出\"([^\"]*)\"元$")
    public void 我选择固定金额取款方式取出_元(String receivedAmount) throws Throwable {
    }

    @而且("^我账户的余额应该是\"([^\"]*)\"元$")
    public void 我账户的余额应该是_元(String remainingBalance) throws Throwable {
    }
}
