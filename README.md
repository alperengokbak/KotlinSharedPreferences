# KotlinSharedPreferences
### English
When we want to save data, there is a structure that we can use to store small data. We call this structure sharedPreferences. It creates an **xml** file in the folder that contains **data data** from the folders inside the device, that is, the data file. But it can hold small-scale data. This is an interface structure. While creating this structure, we need to use context again. As a context, we will work with the ActivityContext, ie **this** command;
```
var sharedPreferences = this.getSharedPreferences("com.alperengokbak.hideusername", Context.MODE_PRIVATE)
```
It asks us for two parameters, one is context and the other is **mode**.
!!! To indicate that we will not value a data and will initiate it later;
```
lateinit var sharedPreferences : SharedPreferences
```
There is a command like While saving the data, we will follow these steps;
```
val username = txtEdit.text.toString()  
  
if (username == "") {  
    Toast.makeText(this, "Enter The Valid Variable!!",Toast.LENGTH_LONG).show()  
} else {  
    sharedPreferences.edit().putString("Username", username).apply()  
    txtView.text = "Saved Username: ${username}"  
}
```
To store the recorded data, we will use the getString method using sharedpreferences;
```
sharedPreferences = this.getSharedPreferences("com.alperengokbak.hideusername", Context.MODE_PRIVATE)  
takenUsername = sharedPreferences.getString("Username", "Test")
```
It asks us for two data, one is the value I wrote in the string while creating sharedPreferences, and the other is what should I print if I can't find the value I wrote. But since this method returns a nullable string;
```
var takenUsername : String? = null
```
In this way, we need to create it by assigning a null value.

### Turkish
Veri kaydetmek istediğimizde, küçük verileri saklamak için kullanabileceğimiz bir yapı mevcuttur. Bu yapı sharedPreferences olarak adlandırıyoruz. Cihazın içerisindeki klasörlerden **data data** olan, yanii veri dosyası olan klasörün içerisinde **xml** dosyası oluşturuyor. Fakat küçük çaplı verileri tutabiliyor. Bu bir arayüz yapısıdır. Bu yapıyı oluştururken yeniden context kullanmamız gerekmektedir. Context olarak da ActivityContext yanii, **this** komuduyla çalışacağız;
```
var sharedPreferences = this.getSharedPreferences("com.alperengokbak.hideusername", Context.MODE_PRIVATE)
```
Bizden iki parametre ister, bir tanesi context bir diğeri ise **mode**, mode belirleken Context yazdıktan sonra **.** koyup çıkan ekrandan erişim sağlayabililyoruz.
!!! Bir veriye değer vermeyip daha sonra initilaze edeceğimizi belli etmek için;
```
lateinit var sharedPreferences : SharedPreferences
```
şeklinde bir komut vardır. Veriyi kaydederken şu adımları izleyeceğiz;
```
val username = txtEdit.text.toString()  
  
if (username == "") {  
    Toast.makeText(this, "Enter The Valid Variable!!",Toast.LENGTH_LONG).show()  
} else {  
    sharedPreferences.edit().putString("Username", username).apply()  
    txtView.text = "Saved Username: ${username}"  
}
```
Kaydedilen veriyi saklamak için ise sharedpreferences'i kullanarak getString methodunu kullanacağız;
```
sharedPreferences = this.getSharedPreferences("com.alperengokbak.hideusername", Context.MODE_PRIVATE)  
takenUsername = sharedPreferences.getString("Username", "Test")
```
Bizden iki veri istiyor, bunlardan bir ilki sharedPreferences oluştururken string içine yazdığımı değer, diğeri ise bu yazdığımız değeri bulamazsam ne yazdırayım. Fakat bu method string nullable döndürdüğünden oluştururken;
```
var takenUsername : String? = null
```
Bu şekilde null değer atayarak oluşturmamız gerekmektedir.
