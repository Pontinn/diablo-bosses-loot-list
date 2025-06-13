# 📦 Formato do JSON para Carga de Itens Únicos

Este projeto permite popular o banco de dados com **itens únicos** usando um arquivo `.json`.  
Abaixo está o formato esperado para que os dados sejam lidos corretamente durante a execução da aplicação.

---

## 📁 Estrutura do JSON

```json
[
  {
    "name": "Ring of Starless Sky",
    "imgUrl": "img-url",
    "itemType": "Ring",
    "itemRarity": "Mythic",
    "itemPropriety1": "Propriety 1",
    "itemPropriety2": "Propriety 2",
    "itemAffix1": "Affix 1",
    "itemAffix2": "Affix 2",
    "itemAffix3": "Affix 3",
    "itemAffix4": "Affix 4",
    "itemAspect": "Aspect",
    "bosses": [
      "Duriel"
    ],
    "classNames": [
      "Barbarian",
      "Druid"
    ]
  }
]

```
🧩 Campos obrigatórios
Campo	Tipo	Descrição
name	string	Nome do item único
imgUrl	string	URL da imagem
itemType	string	Tipo do item (ver lista abaixo)
itemRarity	string	Raridade do item (ver lista abaixo)
itemPropriety1	string	Propriedade especial 1
itemPropriety2	string	Propriedade especial 2
itemAffix1-4	string	Atributos secundários (affixes)
itemAspect	string	Aspecto especial do item
bosses	array de strings	Lista com os nomes dos bosses que podem dropá-lo
classNames	array de strings	Lista de classes que podem usar o item (ex: "Druid", "Rogue")

🧠 Opções válidas para itemType
Você deve usar exatamente uma das strings abaixo para o campo itemType:

"Helm"

"Chest Armor"

"Gloves"

"Pants"

"Boots"

"Amulet"

"Ring"

"Staff"

"Quarterstaff"

"Wand"

"Focus"

"One Handed Sword"

"Two Handed Sword"

"Dagger"

"One Handed Mace"

"Two Handed Mace"

"Glaive"

"Bow"

"One Handed Scythe"

"Two Handed Scythe"

"Totem"

"One Handed Axe"

"Two Handed Axe"

"Shield"

🧠 Opções válidas para itemRarity
Você deve usar uma das seguintes strings para o campo itemRarity:

"UNIQUE"

"MYTHIC"

⚠️ Ambos os campos são case-insensitive, mas é boa prática manter o padrão correto (tudo maiúsculo, como definido nos enums).

✅ Exemplo com múltiplos itens
json
Copiar
Editar
[
  {
    "name": "Ring of Starless Sky",
    "imgUrl": "img-url-1",
    "itemType": "Ring",
    "itemRarity": "MYTHIC",
    "itemPropriety1": "Propriety 1",
    "itemPropriety2": "Propriety 2",
    "itemAffix1": "Affix 1",
    "itemAffix2": "Affix 2",
    "itemAffix3": "Affix 3",
    "itemAffix4": "Affix 4",
    "itemAspect": "Aspect",
    "bosses": ["Duriel"],
    "classNames": ["Druid", "Barbarian"]
  },
  {
    "name": "Grasp of Shadow",
    "imgUrl": "img-url-2",
    "itemType": "Gloves",
    "itemRarity": "UNIQUE",
    "itemPropriety1": "Boosts Shadow damage",
    "itemPropriety2": "Enhances traps",
    "itemAffix1": "Dexterity +10",
    "itemAffix2": "Attack Speed +5%",
    "itemAffix3": "Shadow Resistance +7%",
    "itemAffix4": "Critical Chance +4%",
    "itemAspect": "Shadow Trap Enhancement",
    "bosses": ["Lord Zir"],
    "classNames": ["Rogue"]
  }
]
📌 Onde colocar o JSON?
O arquivo deve ser salvo no seguinte caminho no projeto:

css
Copiar
Editar
src/main/resources/data/uniques.json
Esse arquivo será lido automaticamente durante o processo de seed da aplicação via CommandLineRunner.
