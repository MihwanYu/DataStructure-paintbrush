i m p o r t   j a v a . a w t . B a s i c S t r o k e ;  
 i m p o r t   j a v a . a w t . B o r d e r L a y o u t ;  
 i m p o r t   j a v a . a w t . C o l o r ;  
 i m p o r t   j a v a . a w t . D i m e n s i o n ;  
 i m p o r t   j a v a . a w t . F l o w L a y o u t ;  
 i m p o r t   j a v a . a w t . G r a p h i c s ;  
 i m p o r t   j a v a . a w t . G r a p h i c s 2 D ;  
 i m p o r t   j a v a . a w t . I m a g e ;  
 i m p o r t   j a v a . a w t . P o i n t ;  
 i m p o r t   j a v a . a w t . e v e n t . A c t i o n E v e n t ;  
 i m p o r t   j a v a . a w t . e v e n t . A c t i o n L i s t e n e r ;  
 i m p o r t   j a v a . a w t . e v e n t . M o u s e E v e n t ;  
 i m p o r t   j a v a . a w t . e v e n t . M o u s e L i s t e n e r ;  
 i m p o r t   j a v a . a w t . e v e n t . M o u s e M o t i o n L i s t e n e r ;  
 i m p o r t   j a v a . a w t . i m a g e . B u f f e r e d I m a g e ;  
 i m p o r t   j a v a . i o . F i l e ;  
 i m p o r t   j a v a . i o . I O E x c e p t i o n ;  
 i m p o r t   j a v a . n e t . M a l f o r m e d U R L E x c e p t i o n ;  
 i m p o r t   j a v a . n e t . U R L ;  
  
 i m p o r t   j a v a x . i m a g e i o . I m a g e I O ;  
 i m p o r t   j a v a x . s w i n g . D e f a u l t C o m b o B o x M o d e l ;  
 i m p o r t   j a v a x . s w i n g . I m a g e I c o n ;  
 i m p o r t   j a v a x . s w i n g . J B u t t o n ;  
 i m p o r t   j a v a x . s w i n g . J C o m b o B o x ;  
 i m p o r t   j a v a x . s w i n g . J F i l e C h o o s e r ;  
 i m p o r t   j a v a x . s w i n g . J F r a m e ;  
 i m p o r t   j a v a x . s w i n g . J L a b e l ;  
 i m p o r t   j a v a x . s w i n g . J M e n u ;  
 i m p o r t   j a v a x . s w i n g . J M e n u B a r ;  
 i m p o r t   j a v a x . s w i n g . J M e n u I t e m ;  
 i m p o r t   j a v a x . s w i n g . J P a n e l ;  
 i m p o r t   j a v a x . s w i n g . J S p i n n e r ;  
 i m p o r t   j a v a x . s w i n g . J T o o l B a r ;  
 i m p o r t   j a v a x . s w i n g . S p i n n e r N u m b e r M o d e l ;  
 i m p o r t   j a v a x . s w i n g . S w i n g U t i l i t i e s ;  
 i m p o r t   j a v a x . s w i n g . f i l e c h o o s e r . F i l e N a m e E x t e n s i o n F i l t e r ;  
  
 p u b l i c   c l a s s   T e s t G U I   {  
  
 	 p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g [ ]   a r g s )   {  
 	 	 / /   T O D O   A u t o - g e n e r a t e d   m e t h o d   s t u b  
 	 	 S w i n g U t i l i t i e s . i n v o k e L a t e r ( n e w   R u n n a b l e ( )   {  
 	 	 	 p u b l i c   v o i d   r u n ( )   {  
 	 	 	 	 S y s t e m . o u t . p r i n t l n ( " ��X���JŔ�tИ���" ) ;  
 / / 	 	 	 	 c r e a t e A n d S h o w G U I ( ) ;  
 	 	 	 }  
 	 	 } ) ;  
 	 }  
  
 	 p r i v a t e   s t a t i c   v o i d   c r e a t e A n d S h o w G U I ( )   {  
 	 	 S y s t e m . o u t . p r i n t l n ( " C r e a t e d   G U I   o n   E D T ? "   +   S w i n g U t i l i t i e s . i s E v e n t D i s p a t c h T h r e a d ( ) ) ;  
 / / 	 	 J F r a m e   f   =   n e w   J F r a m e ( " S w i n g   P a i n t   D e m o " ) ;  
 	 	 J F r a m e   f   =   n e w   D S _ p r o j e c t _ v 1 ( ) ;  
 	 	 f . s e t D e f a u l t C l o s e O p e r a t i o n ( J F r a m e . E X I T _ O N _ C L O S E ) ;  
 	 	 R e c t P a n e l   r e c t P a n e l   =   n e w   R e c t P a n e l ( ) ;  
 	 	 f . a d d ( r e c t P a n e l ,   B o r d e r L a y o u t . N O R T H ) ; / / ��0��  R e c t P a n e l �� � 
 	 	 f . p a c k ( ) ;  
 	 	 f . s e t V i s i b l e ( t r u e ) ;  
 	 }  
  
 }  
  
  
 / / p r o g r a m   p a n e l =� 
 c l a s s   R e c t P a n e l   e x t e n d s   J P a n e l   i m p l e m e n t s   A c t i o n L i s t e n e r ,   M o u s e L i s t e n e r ,   M o u s e M o t i o n L i s t e n e r   {  
  
 	 S t r i n g   s h a p e S t r i n g   =   " " ;   / /   ĳ�X�  ���|�  ����  ��� 
 	 P o i n t   f i r s t P o i n t e r   =   n e w   P o i n t ( 0 ,   0 ) ;  
 	 P o i n t   s e c o n d P o i n t e r   =   n e w   P o i n t ( 0 ,   0 ) ;  
 	 B u f f e r e d I m a g e   b u f f e r e d I m a g e ;  
 	 C o l o r   c o l o r s   =   C o l o r . b l a c k ;  
 	 F l o a t   s t r o k e   =   ( f l o a t )   5 ;  
 	 J C o m b o B o x < C o l o r >   c o l o r C o m b o B o x ;  
 	 J C o m b o B o x < F l o a t >   s t r o k e C o m b o B o x ;   / /   f l o a t \�  $��t��Ȕ�  t� ǔ�  s e t S t r o k e ���  ���  xǐ�  ��̸�t�  f l o a t  
  
 	 i n t   w i d t h ;  
 	 i n t   h e i g h t ;  
 	 i n t   m i n P o i n t x ;  
 	 i n t   m i n P o i n t y ;  
 	  
 	 p u b l i c   R e c t P a n e l ( )   {  
 	 	 / / p a n e l   l�1�  �ƌ�  ��1� 
 	 	 / / D S _ p r o j e c t . j a v a   -   c r e a t e m e n u ��  ��X�  t�����  �����   �8�(�p� 
 	 	 J T o o l B a r   t b   =   n e w   J T o o l B a r ( ) ;  
                 S p i n n e r N u m b e r M o d e l   f o n t s i z e   =   n e w   S p i n n e r N u m b e r M o d e l ( 8 ,   1 ,   5 0 ,   1 ) ;  
                 J S p i n n e r   s p i n n e r   =   n e w   J S p i n n e r ( f o n t s i z e ) ;  
                 J C o m b o B o x   c o m b o   =   n e w   J C o m b o B o x < > ( ) ;  
  
                 a d d ( t b ) ;  
                 t b . s e t L o c a t i o n ( 0 ,   0 ) ;  
                 t b . s e t P r e f e r r e d S i z e ( n e w   D i m e n s i o n ( 1 0 0 0 , 6 0 ) ) ;  
                  
 	 	 I m a g e I c o n   b a c k   =   n e w   I m a g e I c o n ( " f o l d e r / b a c k . p n g " ) ;  
                 I m a g e I c o n   b a c k 2   =   n e w   I m a g e I c o n ( " f o l d e r / b a c k 2 . p n g " ) ;  
                 I m a g e I c o n   c o p y   =   n e w   I m a g e I c o n ( " f o l d e r / c o p y . p n g " ) ;  
                 I m a g e I c o n   c o p y 2   =   n e w   I m a g e I c o n ( " f o l d e r / c o p y 2 . p n g " ) ;  
                 I m a g e I c o n   f r o n t   =   n e w   I m a g e I c o n ( " f o l d e r / f r o n t . p n g " ) ;  
                 I m a g e I c o n   f r o n t 2   =   n e w   I m a g e I c o n ( " f o l d e r / f r o n t 2 . p n g " ) ;  
                 I m a g e I c o n   p a s t e   =   n e w   I m a g e I c o n ( " f o l d e r / p a s t e . p n g " ) ;  
                 I m a g e I c o n   p a s t e 2   =   n e w   I m a g e I c o n ( " f o l d e r / p a s t e 2 . p n g " ) ;  
                 I m a g e I c o n   l e f t r o t a t i o n   =   n e w   I m a g e I c o n ( " f o l d e r / l e f t r o t a t i o n . p n g " ) ;  
                 I m a g e I c o n   l e f t r o t a t i o n 2   =   n e w   I m a g e I c o n ( " f o l d e r / l e f t r o t a t i o n 2 . p n g " ) ;  
                 I m a g e I c o n   r i g h t r o t a t i o n   =   n e w   I m a g e I c o n ( " f o l d e r / r i g h t r o t a t i o n . p n g " ) ;  
                 I m a g e I c o n   r i g h t r o t a t i o n 2   =   n e w   I m a g e I c o n ( " f o l d e r / r i g h t r o t a t i o n 2 . p n g " ) ;  
                 I m a g e I c o n   c o l o r   =   n e w   I m a g e I c o n ( " f o l d e r / c o l o r . p n g " ) ;  
                 I m a g e I c o n   c o l o r 2   =   n e w   I m a g e I c o n ( " f o l d e r / c o l o r 2 . p n g " ) ;  
                 I m a g e I c o n   l i n e   =   n e w   I m a g e I c o n ( " f o l d e r / l i n e . p n g " ) ;  
                 I m a g e I c o n   l i n e 2   =   n e w   I m a g e I c o n ( " f o l d e r / l i n e 2 . p n g " ) ;  
                 I m a g e I c o n   e r a s e   =   n e w   I m a g e I c o n ( " f o l d e r / e r a s e . p n g " ) ;  
                 I m a g e I c o n   e r a s e 2   =   n e w   I m a g e I c o n ( " f o l d e r / e r a s e 2 . p n g " ) ;  
  
                 I m a g e [ ]   o r g _ i m a g e   =   n e w   I m a g e [ 9 ] ;  
                 I m a g e [ ]   c h _ i m a g e   =   n e w   I m a g e [ 9 ] ;  
                 I m a g e I c o n [ ]   o r g _ i c o n   =   n e w   I m a g e I c o n [ 9 ] ;  
                 I m a g e I c o n [ ]   c h _ i c o n   =   n e w   I m a g e I c o n [ 9 ] ;  
  
                 o r g _ i m a g e [ 0 ]   =   b a c k . g e t I m a g e ( ) ;  
                 o r g _ i m a g e [ 1 ]   =   f r o n t . g e t I m a g e ( ) ;  
                 o r g _ i m a g e [ 2 ]   =   c o p y . g e t I m a g e ( ) ;  
                 o r g _ i m a g e [ 3 ]   =   p a s t e . g e t I m a g e ( ) ;  
                 o r g _ i m a g e [ 4 ]   =   l e f t r o t a t i o n . g e t I m a g e ( ) ;  
                 o r g _ i m a g e [ 5 ]   =   r i g h t r o t a t i o n . g e t I m a g e ( ) ;  
                 o r g _ i m a g e [ 6 ]   =   c o l o r . g e t I m a g e ( ) ;  
                 o r g _ i m a g e [ 7 ]   =   l i n e . g e t I m a g e ( ) ;  
                 o r g _ i m a g e [ 8 ]   =   e r a s e . g e t I m a g e ( ) ;  
  
                 c h _ i m a g e [ 0 ]   =   b a c k 2 . g e t I m a g e ( ) ;  
                 c h _ i m a g e [ 1 ]   =   f r o n t 2 . g e t I m a g e ( ) ;  
                 c h _ i m a g e [ 2 ]   =   c o p y 2 . g e t I m a g e ( ) ;  
                 c h _ i m a g e [ 3 ]   =   p a s t e 2 . g e t I m a g e ( ) ;  
                 c h _ i m a g e [ 4 ]   =   l e f t r o t a t i o n 2 . g e t I m a g e ( ) ;  
                 c h _ i m a g e [ 5 ]   =   r i g h t r o t a t i o n 2 . g e t I m a g e ( ) ;  
                 c h _ i m a g e [ 6 ]   =   c o l o r 2 . g e t I m a g e ( ) ;  
                 c h _ i m a g e [ 7 ]   =   l i n e 2 . g e t I m a g e ( ) ;  
                 c h _ i m a g e [ 8 ]   =   e r a s e 2 . g e t I m a g e ( ) ;  
  
                 f o r   ( i n t   i   =   0 ;   i   <   o r g _ i m a g e . l e n g t h ;   i + + )   {  
                         o r g _ i m a g e [ i ]   =   o r g _ i m a g e [ i ] . g e t S c a l e d I n s t a n c e ( 4 0 ,   4 0 ,   I m a g e . S C A L E _ S M O O T H ) ;  
                 }  
  
                 f o r   ( i n t   i   =   0 ;   i   <   c h _ i m a g e . l e n g t h ;   i + + )   {  
                         c h _ i m a g e [ i ]   =   c h _ i m a g e [ i ] . g e t S c a l e d I n s t a n c e ( 4 0 ,   4 0 ,   I m a g e . S C A L E _ S M O O T H ) ;  
                 }  
  
                 f o r   ( i n t   i   =   0 ;   i   <   o r g _ i c o n . l e n g t h ;   i + + )   {  
                         o r g _ i c o n [ i ]   =   n e w   I m a g e I c o n ( o r g _ i m a g e [ i ] ) ;  
                 }  
  
                 f o r   ( i n t   i   =   0 ;   i   <   c h _ i c o n . l e n g t h ;   i + + )   {  
                         c h _ i c o n [ i ]   =   n e w   I m a g e I c o n ( c h _ i m a g e [ i ] ) ;  
                 }  
  
  
                 t b . s e t B a c k g r o u n d ( C o l o r . w h i t e ) ;  
                 t b . s e t L a y o u t ( n e w   F l o w L a y o u t ( ) ) ;  
  
  
                 J B u t t o n [ ]   b t n   =   n e w   J B u t t o n [ 9 ] ;  
  
                 f o r   ( i n t   i   =   0 ;   i   <   b t n . l e n g t h ;   i + + )   {  
                         b t n [ i ]   =   n e w   J B u t t o n ( o r g _ i c o n [ i ] ) ;  
                         t b . a d d ( b t n [ i ] ) ;  
                         b t n [ i ] . s e t P r e f e r r e d S i z e ( n e w   D i m e n s i o n ( 4 0 ,   4 0 ) ) ;  
                         b t n [ i ] . s e t R o l l o v e r I c o n ( c h _ i c o n [ i ] ) ;  
                         b t n [ i ] . s e t B o r d e r P a i n t e d ( t r u e ) ;  
                         t b . a d d S e p a r a t o r ( ) ;  
                 }  
  
                 t b . a d d S e p a r a t o r ( ) ;  
  
                 J L a b e l   s i z e l a b e l   =   n e w   J L a b e l ( " T e x t   S i z e " ) ;  
                 s i z e l a b e l . s e t P r e f e r r e d S i z e ( n e w   D i m e n s i o n ( 6 0 ,   4 0 ) ) ;  
                 t b . a d d ( s i z e l a b e l ) ;  
                 t b . a d d ( s p i n n e r ) ;  
  
                 t b . a d d S e p a r a t o r ( ) ;  
  
                 J L a b e l   f o n t l a b e l   =   n e w   J L a b e l ( " F o n t s " ) ;  
                 f o n t l a b e l . s e t P r e f e r r e d S i z e ( n e w   D i m e n s i o n ( 4 0 , 4 0 ) ) ;  
                 c o m b o . a d d I t e m ( " ѹ@�  ��" ) ;  
                 c o m b o . a d d I t e m ( " �����" ) ;  
                 c o m b o . a d d I t e m ( " h��q����" ) ;  
                 t b . a d d ( f o n t l a b e l ) ;  
                 t b . a d d ( c o m b o ) ;  
 / / 	 	 a d d ( o p e n B u t t o n ) ;  
  
 	 	 D i m e n s i o n   d   =   g e t P r e f e r r e d S i z e ( ) ;  
 	 	 b u f f e r e d I m a g e   =   n e w   B u f f e r e d I m a g e ( d . w i d t h ,   d . h e i g h t ,   B u f f e r e d I m a g e . T Y P E _ I N T _ A R G B ) ;  
 	 	 s e t I m a g e B a c k g r o u n d ( b u f f e r e d I m a g e ) ;   / /   s a v e   `�  L�  0���t�  d e f a u l t \�  b l a c k t����  p���<�\� 
  
 / / 	 	 e r a s e A l l B u t t o n . a d d A c t i o n L i s t e n e r ( t h i s ) ;  
 / / 	 	 r e c t B u t t o n . a d d A c t i o n L i s t e n e r ( t h i s ) ;  
 / / 	 	 e r a s e B u t t o n . a d d A c t i o n L i s t e n e r ( t h i s ) ;  
 / / 	 	 c o l o r C o m b o B o x . a d d A c t i o n L i s t e n e r ( t h i s ) ;  
 / / 	 	 s t r o k e C o m b o B o x . a d d A c t i o n L i s t e n e r ( t h i s ) ;  
 / / 	 	 s a v e B u t t o n . a d d A c t i o n L i s t e n e r ( n e w   S a v e L ( t h i s ,   b u f f e r e d I m a g e ) ) ;  
 / / 	 	 o p e n B u t t o n . a d d A c t i o n L i s t e n e r ( n e w   O p e n L ( t h i s ,   b u f f e r e d I m a g e ) ) ;  
  
 	 	 a d d M o u s e L i s t e n e r ( t h i s ) ;  
 	 	 a d d M o u s e M o t i o n L i s t e n e r ( t h i s ) ;  
  
 	 }  
  
 	 / *   m o u s e P r e s s e d  
 	   *   tЭ�t�  ���t�  ���  ����\�  �X�   ȥ�  ���|�  �0�T�h� 
 	   *   f i r s t P o i n t e r < -   tЭ��  �X�  ��\� 
 	   * /  
 	 p u b l i c   v o i d   m o u s e P r e s s e d ( M o u s e E v e n t   e )   {  
 	 	 S y s t e m . o u t . p r i n t l n ( " m o u s e   p r e s s e d   i n   p a n e l " ) ;  
  
 	 	 / /   ���  tЭ��Dǽ���  ��\�  �0�T� 
 	 	 f i r s t P o i n t e r . s e t L o c a t i o n ( 0 ,   0 ) ;  
 	 	 s e c o n d P o i n t e r . s e t L o c a t i o n ( 0 ,   0 ) ;  
  
 	 	 f i r s t P o i n t e r . s e t L o c a t i o n ( e . g e t X ( ) ,   e . g e t Y ( ) ) ;  
  
 	 }  
  
 	 / *   m o u s e R e l e a s e  
 	   *   ȹ�Ƥ�  tЭ�  ]���L� 
 	   *   s e c o n d P o i n t e r < -   ȹ��ɹ<�\�  tЭ��  �X� 
 	   * /  
 	 p u b l i c   v o i d   m o u s e R e l e a s e d ( M o u s e E v e n t   e )   {  
 	 	 S y s t e m . o u t . p r i n t l n ( " m o u s e   r e l e a s e d   i n   p a n e l " ) ;  
 	 	 s e c o n d P o i n t e r . s e t L o c a t i o n ( e . g e t X ( ) ,   e . g e t Y ( ) ) ;  
 	 	 u p d a t e P a i n t ( ) ;  
 	 }  
  
 	 p u b l i c   v o i d   a c t i o n P e r f o r m e d ( A c t i o n E v e n t   e )   {  
 	 	 S y s t e m . o u t . p r i n t l n ( " a c t i o n   p e r f o r m e d   i n   p a n e l " ) ;  
 	 	 / / $���  o r   �ɰ��  o r   ȴ�  �ɰ�0� 
 	 	 i f   ( e . g e t S o u r c e ( ) . g e t C l a s s ( ) . t o S t r i n g ( ) . c o n t a i n s ( " J B u t t o n " ) )   {  
 	 	 	 s h a p e S t r i n g   =   e . g e t A c t i o n C o m m a n d ( ) ;  
 	 	 }  
 	 	 / / ����   ��� 
 	 	 e l s e   i f   ( e . g e t S o u r c e ( ) . e q u a l s ( c o l o r C o m b o B o x ) )   {  
 	 	 	 c o l o r s   =   ( C o l o r )   c o l o r C o m b o B o x . g e t S e l e c t e d I t e m ( ) ;  
 	 	 }  
 	 	 / / u�0�   ��� 
 	 	 e l s e   i f   ( e . g e t S o u r c e ( ) . e q u a l s ( s t r o k e C o m b o B o x ) )   {  
 	 	 	 s t r o k e   =   ( f l o a t )   s t r o k e C o m b o B o x . g e t S e l e c t e d I t e m ( ) ;  
 	 	 }  
  
 	 }  
  
 	 p u b l i c   D i m e n s i o n   g e t P r e f e r r e d S i z e ( )   {  
 	 	 r e t u r n   n e w   D i m e n s i o n ( 1 0 0 0 ,   4 0 0 ) ;  
 	 }  
  
 	  
 	 p u b l i c   v o i d   u p d a t e P a i n t ( )   {  
 	 	 / / w i d t h ,   h e i g h t :   P��X�  �( f i r s t P o i n t e r ,   s e c o n d P o i n t e r ) �X�  x ,   y   ��\�  ��  ��� 
 	 	 w i d t h   =   M a t h . a b s ( s e c o n d P o i n t e r . x   -   f i r s t P o i n t e r . x ) ;  
 	 	 h e i g h t   =   M a t h . a b s ( s e c o n d P o i n t e r . y   -   f i r s t P o i n t e r . y ) ;  
  
 	 	 / / m i n P o i n t x , y :   P��X�  �X�  x , y �  �  T�  ��@�  � 
 	 	 m i n P o i n t x   =   M a t h . m i n ( f i r s t P o i n t e r . x ,   s e c o n d P o i n t e r . x ) ;  
 	 	 m i n P o i n t y   =   M a t h . m i n ( f i r s t P o i n t e r . y ,   s e c o n d P o i n t e r . y ) ;  
  
 	 	 / / G r a p h i c s 2 D :   ����  ����0�  �\�  |�t��췬�.   c r e a t e G r a p h i c s X��  ��t�  ]���  d i s p o s e ( ) ,   r e p a i n t ( )   �����|�  \��.  
 	 	 G r a p h i c s 2 D   g   =   b u f f e r e d I m a g e . c r e a t e G r a p h i c s ( ) ;  
  
 	 	 S y s t e m . o u t . p r i n t l n ( " u p d a t e   p a i n t :   s h a p e S t r i n g   i s   " + s h a p e S t r i n g ) ;  
 	 	 / /   d r a w   o n   p a i n t I m a g e   u s i n g   G r a p h i c s  
 	 	 s w i t c h   ( s h a p e S t r i n g )   {  
  
 	 	 c a s e   ( " R e c t a n g u l a r " ) : / / �Ƙ�  $��� �X�  �� 
 	 	 	 S y s t e m . o u t . p r i n t l n ( " p a i n t   r e c t a n g u l a r " ) ;  
 	 	 	 g . s e t C o l o r ( c o l o r s ) ;  
 	 	 	 g . s e t S t r o k e ( n e w   B a s i c S t r o k e ( s t r o k e ) ) ;  
 	 	 	 g . d r a w R e c t ( m i n P o i n t x ,   m i n P o i n t y ,   w i d t h ,   h e i g h t ) ;  
 	 	 	 b r e a k ;  
  
 	 	 c a s e   ( " �ɰ��" ) :  
 	 	 	 g . s e t C o l o r ( C o l o r . w h i t e ) ;  
 	 	 	 g . s e t S t r o k e ( n e w   B a s i c S t r o k e ( s t r o k e ) ) ;  
 	 	 	 g . d r a w L i n e ( f i r s t P o i n t e r . x ,   f i r s t P o i n t e r . y ,   s e c o n d P o i n t e r . x ,   s e c o n d P o i n t e r . y ) ;  
 	 	 	 b r e a k ;  
 	 	 	  
 	 	 c a s e   ( " ȴ��ɰ�0�" ) :  
 	 	 	 s e t I m a g e B a c k g r o u n d ( b u f f e r e d I m a g e ) ;  
 	 	 	 s h a p e S t r i n g   = " " ;  
 	 	 	 b r e a k ;  
 	 	 	  
 	 	 d e f a u l t :  
 	 	 	 b r e a k ;  
 	 	 }  
  
 	 	 g . d i s p o s e ( ) ;  
 	 	 r e p a i n t ( ) ;  
 	 }  
  
 	 / *   p a i n t C o m p o n e n t  
 	   *   b u g f f e r e d I m a g e ��  \�ܴ�  t�����|�  p a n e l ��  ���� 
 	   * /  
 	 p r o t e c t e d   v o i d   p a i n t C o m p o n e n t ( G r a p h i c s   g )   {  
 	 	 s u p e r . p a i n t C o m p o n e n t ( g ) ;  
 	 	 g . d r a w I m a g e ( b u f f e r e d I m a g e ,   0 ,   0 ,   n u l l ) ;  
  
 	 }  
  
 	 p u b l i c   v o i d   s e t I m a g e B a c k g r o u n d ( B u f f e r e d I m a g e   b i )   {  
 	 	 t h i s . b u f f e r e d I m a g e   =   b i ;  
 	 	 G r a p h i c s 2 D   g   =   b u f f e r e d I m a g e . c r e a t e G r a p h i c s ( ) ;  
 	 	 g . s e t C o l o r ( C o l o r . w h i t e ) ;  
 	 	 g . f i l l R e c t ( 0 ,   0 ,   5 0 0 ,   7 0 0 ) ;  
 	 	 g . d i s p o s e ( ) ;  
 	 }  
  
 	 @ O v e r r i d e  
 	 p u b l i c   v o i d   m o u s e D r a g g e d ( M o u s e E v e n t   e )   {  
 	 	 / /   T O D O   A u t o - g e n e r a t e d   m e t h o d   s t u b  
 	 	  
 	 	 w i d t h   =   M a t h . a b s ( s e c o n d P o i n t e r . x   -   f i r s t P o i n t e r . x ) ;  
 	 	 h e i g h t   =   M a t h . a b s ( s e c o n d P o i n t e r . y   -   f i r s t P o i n t e r . y ) ;  
  
 	 	 m i n P o i n t x   =   M a t h . m i n ( f i r s t P o i n t e r . x ,   s e c o n d P o i n t e r . x ) ;  
 	 	 m i n P o i n t y   =   M a t h . m i n ( f i r s t P o i n t e r . y ,   s e c o n d P o i n t e r . y ) ;  
 	 	  
 	 	  
 	 	  
 	 	 i f   ( s h a p e S t r i n g   = =   " ��"   |   s h a p e S t r i n g   = =   " �ɰ��" )   {  
 	 	 	 i f   ( s e c o n d P o i n t e r . x   ! =   0   & &   s e c o n d P o i n t e r . y   ! =   0 )   {  
 	 	 	 	 f i r s t P o i n t e r . x   =   s e c o n d P o i n t e r . x ;  
 	 	 	 	 f i r s t P o i n t e r . y   =   s e c o n d P o i n t e r . y ;  
 	 	 	 }  
 	 	 	 s e c o n d P o i n t e r . s e t L o c a t i o n ( e . g e t X ( ) ,   e . g e t Y ( ) ) ;  
 	 	 	 u p d a t e P a i n t ( ) ;  
 	 	 }   e l s e   i f   ( s h a p e S t r i n g   = =   " R e c t a n g u l a r " )   {  
  
 	 	 	 G r a p h i c s   g   =   g e t G r a p h i c s ( ) ;  
 	 	 	 g . s e t C o l o r ( C o l o r . B L A C K ) ;  
 	 	 	 g . s e t X O R M o d e ( g e t B a c k g r o u n d ( ) ) ;  
 	 	 	  
 	 	 	 g . d r a w R e c t ( m i n P o i n t x ,   m i n P o i n t y ,   w i d t h ,   h e i g h t ) ;  
 	 	 	 s e c o n d P o i n t e r . s e t L o c a t i o n ( e . g e t X ( ) ,   e . g e t Y ( ) ) ;  
 	 	 	 r e p a i n t ( ) ;  
 	 	 	 g . d i s p o s e ( ) ;  
 	 	 }    
 	 	  
 	 	  
 	 }  
  
 	 @ O v e r r i d e  
 	 p u b l i c   v o i d   m o u s e M o v e d ( M o u s e E v e n t   e )   {  
 	 	 / /   T O D O   A u t o - g e n e r a t e d   m e t h o d   s t u b  
  
 	 }  
  
 	 @ O v e r r i d e  
 	 p u b l i c   v o i d   m o u s e C l i c k e d ( M o u s e E v e n t   e )   {  
 	 	 / /   T O D O   A u t o - g e n e r a t e d   m e t h o d   s t u b  
 	 	 S y s t e m . o u t . p r i n t l n ( " m o u s e   c l i c k   i n   p a n e l " ) ;  
  
 	 }  
  
 	 @ O v e r r i d e  
 	 p u b l i c   v o i d   m o u s e E n t e r e d ( M o u s e E v e n t   e )   {  
 	 	 / /   T O D O   A u t o - g e n e r a t e d   m e t h o d   s t u b  
  
 	 }  
  
 	 @ O v e r r i d e  
 	 p u b l i c   v o i d   m o u s e E x i t e d ( M o u s e E v e n t   e )   {  
 	 	 / /   T O D O   A u t o - g e n e r a t e d   m e t h o d   s t u b  
  
 	 }  
  
 } / /   C l a s s   d o t B u t t o n  
  
 / / �|ǈ��$�0� 
 c l a s s   O p e n L {  
  
 	 R e c t P a n e l   r e c t P a n e l ;  
 	 B u f f e r e d I m a g e   b u f f e r e d I m a g e ;  
 	 J F i l e C h o o s e r   j F i l e C h o o s e r   =   n e w   J F i l e C h o o s e r ( ) ; ;  
  
 	 O p e n L ( R e c t P a n e l   r e c t P a n e l ,   B u f f e r e d I m a g e   b u f f e r e d I m a g e )   {  
 	 	 t h i s . r e c t P a n e l   =   r e c t P a n e l ;  
 	 	 t h i s . b u f f e r e d I m a g e   =   b u f f e r e d I m a g e ;  
  
 	 }  
  
 / / 	 @ O v e r r i d e  
 / / 	 p u b l i c   v o i d   a c t i o n P e r f o r m e d ( A c t i o n E v e n t   e )   {  
 / / 	 	 / /   T O D O   A u t o - g e n e r a t e d   m e t h o d   s t u b  
 / / 	 	 F i l e N a m e E x t e n s i o n F i l t e r   f i l t e r   =   n e w   F i l e N a m e E x t e n s i o n F i l t e r ( " J P E G " ,   " j p e g " ,   " j p g " ,   " p n g " ,   " b m p " ,   " g i f " ) ;  
 / / 	 	 j F i l e C h o o s e r . a d d C h o o s a b l e F i l e F i l t e r ( f i l t e r ) ;  
 / /  
 / / 	 	 i n t   r V a l   =   j F i l e C h o o s e r . s h o w O p e n D i a l o g ( n u l l ) ;  
 / / 	 	 i f   ( r V a l   = =   J F i l e C h o o s e r . A P P R O V E _ O P T I O N )   {  
 / / 	 	 	 F i l e   s e l e c t e d F i l e   =   j F i l e C h o o s e r . g e t S e l e c t e d F i l e ( ) ;  
 / / 	 	 	 t r y   {  
 / / 	 	 	 	 r e c t P a n e l . b u f f e r e d I m a g e   =   I m a g e I O . r e a d ( n e w   F i l e ( s e l e c t e d F i l e . g e t A b s o l u t e P a t h ( ) ) ) ;  
 / / 	 	 	 	 r e c t P a n e l . r e p a i n t ( ) ;  
 / / 	 	 	 }   c a t c h   ( I O E x c e p t i o n   e 1 )   {  
 / / 	 	 	 	 / /   T O D O   A u t o - g e n e r a t e d   c a t c h   b l o c k  
 / / 	 	 	 	 e 1 . p r i n t S t a c k T r a c e ( ) ;  
 / / 	 	 	 }  
 / / 	 	 }  
 / / 	 	 i f   ( r V a l   = =   J F i l e C h o o s e r . C A N C E L _ O P T I O N )   {  
 / /  
 / / 	 	 }  
 / / 	 }  
 	 p u b l i c   v o i d   o p e n P i c ( )   {  
 	 	 / /   T O D O   A u t o - g e n e r a t e d   m e t h o d   s t u b  
 	 	 F i l e N a m e E x t e n s i o n F i l t e r   f i l t e r   =   n e w   F i l e N a m e E x t e n s i o n F i l t e r ( " J P E G " ,   " j p e g " ,   " j p g " ,   " p n g " ,   " b m p " ,   " g i f " ) ;  
 	 	 j F i l e C h o o s e r . a d d C h o o s a b l e F i l e F i l t e r ( f i l t e r ) ;  
  
 	 	 i n t   r V a l   =   j F i l e C h o o s e r . s h o w O p e n D i a l o g ( n u l l ) ;  
 	 	 i f   ( r V a l   = =   J F i l e C h o o s e r . A P P R O V E _ O P T I O N )   {  
 	 	 	 F i l e   s e l e c t e d F i l e   =   j F i l e C h o o s e r . g e t S e l e c t e d F i l e ( ) ;  
 	 	 	 t r y   {  
 	 	 	 	 r e c t P a n e l . b u f f e r e d I m a g e   =   I m a g e I O . r e a d ( n e w   F i l e ( s e l e c t e d F i l e . g e t A b s o l u t e P a t h ( ) ) ) ;  
 	 	 	 	 r e c t P a n e l . r e p a i n t ( ) ;  
 	 	 	 }   c a t c h   ( I O E x c e p t i o n   e 1 )   {  
 	 	 	 	 / /   T O D O   A u t o - g e n e r a t e d   c a t c h   b l o c k  
 	 	 	 	 e 1 . p r i n t S t a c k T r a c e ( ) ;  
 	 	 	 }  
 	 	 }  
 	 	 i f   ( r V a l   = =   J F i l e C h o o s e r . C A N C E L _ O P T I O N )   {  
  
 	 	 }  
  
 	 }  
  
 } / /   c l a s s   O p e n L  
  
 / / �|� ȥ�X�0� 
 c l a s s   S a v e L   {  
  
 	 R e c t P a n e l   r e c t P a n e l ;  
 	 B u f f e r e d I m a g e   b u f f e r e d I m a g e ;  
 	 J F i l e C h o o s e r   j F i l e C h o o s e r ;  
  
 	 S a v e L ( R e c t P a n e l   r e c t P a n e l ,   B u f f e r e d I m a g e   b u f f e r e d I m a g e )   {  
 	 	 t h i s . r e c t P a n e l   =   r e c t P a n e l ;  
 	 	 t h i s . b u f f e r e d I m a g e   =   b u f f e r e d I m a g e ;  
 / / 	 	 s a v e P i c ( ) ;  
 	 }  
  
 / / 	 @ O v e r r i d e  
 / / 	 p u b l i c   v o i d   a c t i o n P e r f o r m e d ( A c t i o n E v e n t   e )   {  
 / / 	 	 / /   T O D O   A u t o - g e n e r a t e d   m e t h o d   s t u b  
 / / 	 	 j F i l e C h o o s e r   =   n e w   J F i l e C h o o s e r ( ) ;  
 / / 	 	 j F i l e C h o o s e r . s e t F i l e F i l t e r ( n e w   F i l e N a m e E x t e n s i o n F i l t e r ( " * . p n g " ,   " p n g " ) ) ;  
 / / 	 	 i n t   r V a l   =   j F i l e C h o o s e r . s h o w S a v e D i a l o g ( n u l l ) ;  
 / / 	 	 i f   ( r V a l   = =   J F i l e C h o o s e r . A P P R O V E _ O P T I O N )   {  
 / / 	 	 	 F i l e   f i l e   =   j F i l e C h o o s e r . g e t S e l e c t e d F i l e ( ) ;  
 / / 	 	 	 t r y   {  
 / / 	 	 	 	 I m a g e I O . w r i t e ( b u f f e r e d I m a g e ,   " p n g " ,   n e w   F i l e ( f i l e . g e t A b s o l u t e P a t h ( ) ) ) ;  
 / / 	 	 	 	 S y s t e m . o u t . p r i n t l n ( " s a v e d   C o r r e c t l y   "   +   f i l e . g e t A b s o l u t e P a t h ( ) ) ;  
 / / 	 	 	 }   c a t c h   ( I O E x c e p t i o n   e 1 )   {  
 / / 	 	 	 	 / /   T O D O   A u t o - g e n e r a t e d   c a t c h   b l o c k  
 / / 	 	 	 	 S y s t e m . o u t . p r i n t l n ( " F a i l e d   t o   s a v e   i m a g e " ) ;  
 / / 	 	 	 }  
 / / 	 	 }  
 / / 	 	 i f   ( r V a l   = =   J F i l e C h o o s e r . C A N C E L _ O P T I O N )   {  
 / / 	 	 	 S y s t e m . o u t . p r i n t l n ( " N o   f i l e   c h o o s e n " ) ;  
 / / 	 	 }  
 / /  
 / / 	 }  
 	  
 	 p u b l i c   v o i d   s a v e P i c ( )   {  
 	 	 j F i l e C h o o s e r   =   n e w   J F i l e C h o o s e r ( ) ;  
 	 	 j F i l e C h o o s e r . s e t F i l e F i l t e r ( n e w   F i l e N a m e E x t e n s i o n F i l t e r ( " * . p n g " ,   " p n g " ) ) ;  
 	 	 i n t   r V a l   =   j F i l e C h o o s e r . s h o w S a v e D i a l o g ( n u l l ) ;  
 	 	 i f   ( r V a l   = =   J F i l e C h o o s e r . A P P R O V E _ O P T I O N )   {  
 	 	 	 F i l e   f i l e   =   j F i l e C h o o s e r . g e t S e l e c t e d F i l e ( ) ;  
 	 	 	 t r y   {  
 	 	 	 	 I m a g e I O . w r i t e ( b u f f e r e d I m a g e ,   " p n g " ,   n e w   F i l e ( f i l e . g e t A b s o l u t e P a t h ( ) ) ) ;  
 	 	 	 	 S y s t e m . o u t . p r i n t l n ( " s a v e d   C o r r e c t l y   "   +   f i l e . g e t A b s o l u t e P a t h ( ) ) ;  
 	 	 	 }   c a t c h   ( I O E x c e p t i o n   e 1 )   {  
 	 	 	 	 / /   T O D O   A u t o - g e n e r a t e d   c a t c h   b l o c k  
 	 	 	 	 S y s t e m . o u t . p r i n t l n ( " F a i l e d   t o   s a v e   i m a g e " ) ;  
 	 	 	 }  
 	 	 }  
 	 	 i f   ( r V a l   = =   J F i l e C h o o s e r . C A N C E L _ O P T I O N )   {  
 	 	 	 S y s t e m . o u t . p r i n t l n ( " N o   f i l e   c h o o s e n " ) ;  
 	 	 }  
 	 }  
  
 } / /   c l a s s   S a v e L 