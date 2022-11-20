# valid_sentence

Can you determine if a string is a “valid” sentence, based on a simple set of rules?
For the purposes of this problem, a “valid” sentence is defined as:
- String starts with a capital letter.
- String has an even number of quotation marks.
- String ends with one of the following sentence termination characters: &quot;.&quot;, &quot;?&quot;, &quot;!&quot;
- String has no period characters other than the last character.
- Numbers below 13 are spelled out (”one”, “two”, &quot;three”, etc…).
Here are some examples:
Valid sentences:
The quick brown fox said “hello Mr lazy dog”.
The quick brown fox said hello Mr lazy dog.
One lazy dog is too few, 13 is too many.
One lazy dog is too few, thirteen is too many.
How many &quot;lazy dogs&quot; are there?

Invalid sentences
The quick brown fox said &quot;hello Mr. lazy dog&quot;.
the quick brown fox said “hello Mr lazy dog&quot;.
&quot;The quick brown fox said “hello Mr lazy dog.&quot;
One lazy dog is too few, 12 is too many.
Are there 11, 12, or 13 lazy dogs?
There is no punctuation in this sentence
