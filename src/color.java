i m p o r t   j a v a . a w t . F o n t ;  
 i m p o r t   j a v a . a w t . B o r d e r L a y o u t ;  
 i m p o r t   j a v a . a w t . C o l o r ;  
 i m p o r t   j a v a x . s w i n g . J F r a m e ;  
 i m p o r t   j a v a x . s w i n g . J L a b e l ;  
 i m p o r t   j a v a x . s w i n g . J C o l o r C h o o s e r ;  
 i m p o r t   j a v a x . s w i n g . c o l o r c h o o s e r . C o l o r S e l e c t i o n M o d e l ;  
 i m p o r t   j a v a x . s w i n g . e v e n t . C h a n g e L i s t e n e r ;  
 i m p o r t   j a v a x . s w i n g . e v e n t . C h a n g e E v e n t ;  
  
  
 p u b l i c   c l a s s   c o l o r  
 {  
 	 p u b l i c   s t a t i c   v o i d   m a i n ( S t r i n g   a r g s [ ] )  
 	 {  
 	 	 J F r a m e   f r a m e   =   n e w   J F r a m e ( " C o l o r   p a l e t t e " ) ;  
 	 	 f r a m e . s e t D e f a u l t C l o s e O p e r a t i o n ( J F r a m e . E X I T _ O N _ C L O S E ) ;  
 	 	 f i n a l   J L a b e l   l a b e l   =   n e w   J L a b e l ( " a l e c t u r e . b l o g s p o t . c o m " , J L a b e l . C E N T E R ) ;  
 	 	 l a b e l . s e t F o n t ( n e w   F o n t ( " D I A L O G " ,   F o n t . B O L D | F o n t . I T A L I C , 3 6 ) ) ;  
 	 	 f r a m e . a d d ( l a b e l ,   B o r d e r L a y o u t . S O U T H ) ;   / / �t��D�    ����  DŘ�����  0�X� 
 	 	 f i n a l   J C o l o r C h o o s e r   c h o o s e r   =   n e w   J C o l o r C h o o s e r ( ) ;   / / |�|�  ����  ���� �D� 
 	 	 C o l o r S e l e c t i o n M o d e l   m o d e l   =   c h o o s e r . g e t S e l e c t i o n M o d e l ( ) ;  
  
  
 	 	 C h a n g e L i s t e n e r   l i s t e n e r   =   n e w   C h a n g e L i s t e n e r ( ) {   / / ����  tИ���  �� 
 	 	 	 p u b l i c   v o i d   s t a t e C h a n g e d ( C h a n g e E v e n t   e )  
 	 	 	 {  
 	 	 	 	 C o l o r   n e w F o r e g r o u n d C o l o r   =   c h o o s e r . g e t C o l o r ( ) ; / /  ���\�  |�|��D�  ��4� 
 	 	 	 	 S y s t e m . o u t . p r i n t f ( "  ���\�  ���X�  :   " , n e w F o r e g r o u n d C o l o r ) ;  
 	 	 	 	 l a b e l . s e t F o r e g r o u n d ( n e w F o r e g r o u n d C o l o r ) ;   / /   �X�  �D�  Ƚ���<�\�  ���� 
 	 	 	 }  
 	 	 } ;   / /   ����tИ���  ]� 
  
 	 	 m o d e l . a d d C h a n g e L i s t e n e r ( l i s t e n e r ) ;   / /  � �X�  |�|�   ���D�  0�䲼� 
 	 	 f r a m e . a d d ( c h o o s e r ) ;   / /   ������  |�|�  ����  $�X�X�0� 
 	 	 f r a m e . a d d ( c h o o s e r ) ;  
 	 	 f r a m e . p a c k ( ) ;  
 	 	 f r a m e . s e t V i s i b l e ( t r u e ) ; 	  
 	 } }  
  
  
 