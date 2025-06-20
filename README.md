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

## 🧠 Opções válidas para itemType
Você deve usar exatamente uma das strings abaixo para o campo itemType:

"HELM" 

"CHEST ARMOR"

"GLOVES"

"PANTS"

"BOOTS"

"AMULET"

"RING"

"STAFF"

"QUARTERSTAFF"

"WAND"

"FOCUS"

"ONE HANDED SWORD"

"TWO HANDED SWORD"

"DAGGER"

"ONE HANDED MACE"

"TWO HANDED MACE"

"GLAIVE"

"BOW"

"ONE HANDED SCYTHE"

"TWO HANDED SCYTHE"

"TOTEM"

"ONE HANDED AXE"

"TWO HANDED AXE"

"SHIELD"


## 🧠 Opções válidas para itemRarity
Você deve usar uma das seguintes strings para o campo itemRarity:

"UNIQUE"

"MYTHIC"

## ⚠️ Ambos os campos são case-insensitive, mas é boa prática manter o padrão correto (tudo maiúsculo, como definido nos enums).

## ✅ Exemplo com múltiplos itens
```json
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
```
## 📌 Onde colocar o JSON?
O arquivo deve ser salvo no seguinte caminho no projeto:
src/main/resources/data/uniques.json
Esse arquivo será lido automaticamente durante o processo de seed da aplicação via CommandLineRunner.
