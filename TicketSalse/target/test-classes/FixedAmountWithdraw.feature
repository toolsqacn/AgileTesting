# language: zh-CN
@withdraw
功能: 使用ATM固定金额方式取款
  通常“取款”菜单包含了几个固定金额，使用这些固定金额取款可以避免从键盘输入提取金额，
  从而可以加速交易，提高取款的效率。

  @fixedAmount
  场景大纲: 固定金额取款
    假如 我的账户中有余额"<accountBalance>"元
    当 我选择固定金额取款方式取出"<withdrawAmount>"元
    那么 我应该收到现金"<receivedAmount>"元
    而且 我账户的余额应该是"<remainingBalance>"元
  @positive
    例子:
      | accountBalance | withdrawAmount | receivedAmount | remainingBalance |
      | 1000.00        | 100.00         | 100.00         | 900.00           |
      | 500.00         | 500.00         | 500.00         | 0.00             |
  @negative
    例子:
      | accountBalance | withdrawAmount | receivedAmount | remainingBalance |
      | 1000.00        | 1100.00        | 0.00           | 1000.00          |
      | 500.00         | 600.00         | 0.00           | 500.00           |

