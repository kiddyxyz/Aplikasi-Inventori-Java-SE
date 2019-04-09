# Aplikasi-Inventori-Java-SE
Belajar Aplikasi Inventori Java SE.

Contoh projek Java Programming Desktop CCIT - Fakultas Teknik Universitas Indonesia.

# Instalasi
1. Pastikan Instance SQL kalian menggunakan authentication password.
2. Jalankan file SQL untuk membuat struktur table.
3. Setting Port, Instance, Database, username, dan password, pada class Koneksi sesuai dengan kredensial kalian.

```
String url="jdbc:sqlserver://localhost:[port];instance=Hudya;databaseName=latihan";
con = DriverManager.getConnection(url, "sa", "123456"); //sa adalah username, 123456 adalah password.
```
[port] diganti dengan port yang ada di TCP/IP SQLServer milik anda.
<br/>
default: 51688.
<br/>
Anda dapat mengetahui TCP/IP SQL Server anda dengan mengunjungi [link](https://www.mssqltips.com/sqlservertip/2495/identify-sql-server-tcp-ip-port-being-used/) ini.

4. Jalankan Aplikasi.

# Author
M Hudya Ramadhana (HY).
