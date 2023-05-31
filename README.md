# SI_2023_lab2_213163

# Aleksandar Mitrevski 213163

# Control flow graph

![SI_lab2_graph drawio](https://github.com/AleksandarTheGreat/SI_2023_lab2_213163/assets/126021512/8dad36ed-87f9-413b-bc62-ffe1c1238ecd)

# Ciklomatska kompleksnost
Ciklomatskata kompleksnost e 11, ja dobiv po formulata P = N + 1
kade shto N e brojot na Predikatni teminja

# Multiple Condition 
if (user==null || user.getPassword()==null || user.getEmail()==null)

Imame 8 test sluchaevi
Vo site ovie test sluchaevi ke se frli iskluchok osven vo prviot.

1: Site tri uslovi se false;
  - user != null
  - user.getPassword() != null
  - user.getEmail() != null

2: Samo poseldniot uslov e true, drugite se false
  - user != null
  - user.getPassword() != null
  - user.getEmail() == null

3: Samo sredniot uslov e true, drugite 2 se false
  - user != null
  - user.getPassword() == null
  - user.getEmail() != null
  
4: Samo prviot uslov e false, drugite 2 se true
  - user != null
  - user.getPassword() == null
  - user.getEmail() == null

5: Samo prviot uslov e true, drugite 2 se false
  - user == null
  - user.getPassword() != null
  - user.getEmail() != null

6: Prviot i tretiot uslov se true, sredniot e false
  - user == null
  - user.getPassword() != null
  - user.getEmail() == null

7: Prviot i vtoriot uslov e true, tretiot e false
  - user == null
  - user.getPassword() == null
  - user.getEmail() != null

8: Site se true.
  - user == null
  - user.getPassword() == null
  - user.getEmail() == null

# Every Branch
Za ovaj uslov
if (user==null || user.getPassword()==null || user.getEmail()==null)
  - ako se e null ke frlime iskluchok, inaku prodolzhuvame ponatamu na

if (user.getUsername()==null)
  - mu stavame default username = email

if (user.getEmail().contains("@") && user.getEmail().contains("."))
  - dokolku dvete se true, vlegvame vo for ciklus i proveruvame dva novi uslovi a tie se:
  - if (existingUser.getEmail() == user.getEmail())  
    - se zgolemuva same za 1
  - if (existingUser.getUsername() == user.getUsername())
    - se namaluva same za 1
    
if (passwordLower.contains(user.getUsername().toLowerCase()) || password.length()<8)
  - imame return false i tuka zavrshuva funkcijata, a ako ne e ispolent ovaj uslov odime vo else delot
    kade shto ima for ciklus i vo nego ima uslov za proverka
    if (password.contains(String.valueOf(specialCharacters.charAt(i))))
