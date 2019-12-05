package org.launchcode.java.demos.lsn6inheritance;

public interface Feedable {
    /* A method signature includes the name,
    parameters, and return type of a method,
    but no body.
     */
    void pet();     //method signature
}
/* In the code above, notice the following:
1. That we need to use the interface keyword to define
our interface, Feedable.
2. eat only has a signature. We are NOT allowed to provide
a body for methods defined in interfaces.
3. eat also does not have an access modifier. Interface members
are always public, and while we may use the public modifier,
it’s unnecessary. An interface method may NOT have an access
modifier that is more restrictive than public.
4. The Feedable interface itself is declared public, which
means any other class may use it. We may also leave off public,
making the interface package-private, or usable only within the
same package.
5. The name is indicative of the behavior that the interface
is intended to describe. While this is only a convention,
most interfaces have names that are adjectives. Whatever you
do, use meaningful names!
*/