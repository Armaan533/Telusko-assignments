#Assignment

##Annotations

Annotations in java are the tags which are used to give a class, interface, method or a field more information.
For example:
```java
@Deprecated
public void A(){
}
```
This tag, `@Deprecated`, tells the compiler and also the programmer that this method is deprecated and should not be used.

###``@Target``

Target tag is used to specify the object type on which an annotation can be used. It specifies that by using `java.lang.annotation.ElementType` enum.

There are mainly 7 `ElementType`s  for an annotation:
1)`TYPE` - Annotation of `TYPE` `ElementType` can only be applied on classes, interfaces and enums.
2)`FIELD` - Annotation of `FIELD` `ElementType` can only be applied on fields.
3)`METHOD` - Annotation of `METHOD` `ElementType` can only be applied on methods.
4)`CONSTRUCTOR` - Annotation of `CONSTRUCTOR` `ElementType` can only be applied on constructors.
5)`LOCAL_VARIABLE` - Annotation of `LOCAL_VARIABLE` `ElementType` can only be applied on local variables.
6)`ANNOTATION_TYPE` - Annotation of `ANNOTATION_TYPE` `ElementType` can only be applied on annotation types.
7)`PARAMETER` - Annotation of `PARAMETER` `ElementType` can only be applied on parameters.

###``@Retention``

Retention tag is used to define till how long the annotation is supposed to be kept and not discarded.

There are 3 `RetentionPolicy`:
1)`RetentionPolicy.SOURCE` - This level makes the annotation just for the programmer. It is removed/discarded on compile time.
2)`RetentionPolicy.CLASS` - This level makes the annotation available till compilation but gets discarded on runtime.
3)`RetentionPolicy.RUNTIME` - This level makes the annotation available till the runtime.
