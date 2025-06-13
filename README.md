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
