# 加勒比海盗

### Class Design

- **老板**

	行为：

	- 加工材料

	- 查看现有库存
	- 查看订单
	- 进货
	- 回收

	属性：

	- 容器和其储存物列表
	- 工具列表

- **原料**

	金、银、玉石、钻石

	行为：

	- 原料可使用情况？

	属性：

	- 磨损程度？

- **工具**

	加工台、清理台

- **容器**

	放原料：保险柜

	放展示：展台

	订单包装：包装盒、包装袋

	行为：

	- 存放
	- 取出

- **商品**

	- **单点**

		- 项链

			分为金项链，银项链，金镶钻石，银镶钻石

			属性:

			+ 所需材料列表
			+ 价格

		- 戒指
			金，银，镶钻

		- 手镯
			金，银，玉石

	- **套餐 Set**

		属性：

		- 商品列表

* **订单**