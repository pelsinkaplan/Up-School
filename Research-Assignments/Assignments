# Araştırma Ödevleri:

- [Araştırma Projesi 1 - Lateinit](#1)
- [Araştırma Projesi 2 - Tools Namespace](#2)


### <a name="1"></a> Araştırma Projesi 1

- Lateinit neden kullanıyoruz?
- Lateinit kullanımından bahseder misiniz?
- Lateinit için bir örnek kullanım gösterir misiniz ?

#### Cevaplar:
**Değişkenlerde var ve val arasındaki fark nedir?**

Val değişkenler bir kere tanımlanıp daha sonra değiştirilemeyen sabit değerler oluşturur. Var değişkenler ise normal bir şekilde değişken tanımlamasında kullanılır ve sonrasında dilendiği gibi kullanılır.

**Lateinit nedir, ne için kullanılır? 

Lateinit var olarak tanımlanan, yani sonradan değişebilecek değişkenler için kullanılır. Söz konusu değişkenin daha sonra tanımlanacağının yani nullable bir değişken olmadığının sözünün verildiği bir keyworddür. Bir atama yapılana kadar memoryde yer kaplamaz, tanımlama sırasında sadece tür belirtilir. Primitive tiplerde kullanılmasına izin verilmez.

**Lateinit nasıl kullanılır?

```
lateinit var variableName : String 
variableName = “variable”
```
Yukarıda ilk satırdaki gibi tanımlaması yapılır. Daha sonra da ikinci satırdaki gibi initialize edilir.

**Nullable değişken nedir?

Değişkenin null değere sahip olup olamayacağını bildirir. Bu tarz değişkenler iki farklı şekilde kullanılabiliyor. Değişkenin sonuna !! işaretlerinin konulması ile programa değişkenin null olmadığının garantisi verilmiş olur. Değişkenin sonuna ? konulması ile de değişkenin null olup olmadığı hakkında kesin bir bilgiye sahip olunmadığının ve null durumunda pas geçilebileceğinin bilgisi verilmiş olur.

**Nullable değişkenler nasıl kullanılır?

```
Var tempVar : String?
tempVar!!
tempVar?
```
Yukarıdaki ilk kod satırında tempVar değişkeninin null değere sahip olabileceğini belirtir. 
İkinci satır değişkenin kesinlikle null omadığının garantisini developer tarafından verir.
Üçüncü satır da null olup olmama konusundaki belirsizliği ifade eder.



### <a name="2"></a> Araştırma Projesi 2


- Layout dizini içinde xml dosyalarımız için kullandığımız namespace nedir ?
- Neden kullanılmaktadır ?
- Nasıl kullanılmalıdır ?
- Bir adet Tools (tools namespace) attribute kullanımını gösterir misiniz ? 

#### Cevaplar:

Namespace nedir, ne için kullanılır?

Uygulamanın xml tarafındaki değşikliklerini anlık olarak, derlenmeden görülmesini sağlar. Uygulmama derlendiği zaman bu özellkler otomatik olarak kaldırılır, bu şekilde bu özellikler tasarımda görünür ama uyguluma çalışıtığında görünmez.

Namespace nasıl kullanılır?

```
<Button
	android:layout_width = “wrap_content”
	android:layout_height = “wrap_content”
	android:elevation = “4dp”
	tools:targetApi = “lollipop”/>
 ```
 
yukaradaki xml kod bloğundaki tools:tagetApi namespace i söz konusu viewı destekleyen API levelını belirtmek için kullanılır. 
tools:shrink, tools:keep gibi namespaceler ise Proguard gibi araçların kodu karıştırıp karıştırmamasına izin vermek için kullanılır. Bunlar gibi bir çok örneği mevcuttur.
