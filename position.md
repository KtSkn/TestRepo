# cssの postion について練習する。
***
### propertyの値    
基本的にはtopとleftの指定でよい(rightとbottomは勝手に決まる)
```css:例
a {
  position: relative
  top: 10px;
  left: 20px;
}
```
### property
1. static
2. relative
3. absolute
4. fixed

### 1. static
### 2. relative
起点が **現在の表示位置**
### 3. absolute
起点を **任意に設定できる**    
→最も近いrelativeを基準にする。relativeがなければページ全体(左上)    
    
※インライン要素でも、absoluteを指定することによってブロック要素を持つ

### 4. fixed
基準位置は常にブラウザウィンドウ領域    
navbarやmenuバーなど常に画面に固定したいものがあるときに使う
    
