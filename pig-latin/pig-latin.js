export class translator {
  static translate(phrase) {
    phrase.trim();
    let words= phrase.split(' ');
    let translation="";
    for(let i=0;i<words.length-1;i++)
    {
        translation+=translator.translateUtil(words[i]);
        translation+=' ';
    }
    translation+=translator.translateUtil(words[words.length-1]);
    return translation;
  }
  static translateUtil(word)
  {
    let result='';
    word.toLowerCase();
    let ch=0;
    if(ch<word.length){
    if(translator.isVowelSound(word,ch)||(word.length>2 && word[0]==='x'&&word[1]==='r'))
     result=word;
    else{
     for(ch=0;ch<word.length&& !translator.isVowelSound(word,ch);ch++)
     {
        if(word[ch]==='q'&&ch<word.length-1&&word[ch+1]==='u')
            ch++;
     }
     result=word.slice(ch)+word.slice(0,ch);
    }
    result+='ay';
   }
   return result;
  }
  static isVowelSound(word, index=0)
  {
  const VOWELS = ["a","e","i","o","u","y"];
  const ONLY_Y = 'y';

  let c = word[index];
  let flag = VOWELS.includes(c);
  if (flag && index == 0 && word.length > 1 &&
      ONLY_Y.includes(c) &&
      VOWELS.includes(word[index+1])) {
    flag = false;
  }
  return flag;
 }
}
//console.log(translator.translate('chair'));
