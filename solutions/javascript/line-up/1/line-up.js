//
// This is only a SKELETON file for the 'Line Up' exercise. It's been provided as a
// convenience to get you started writing code faster.
//

export const format = (name,num) => {
  let ordinal = "";
  let strNum = num.toString();
  console.log();
  if(strNum[strNum.length-1] == 1 && strNum[strNum.length-2] != 1){
    ordinal = "st";
  }else if (strNum[strNum.length-1] == 2 && strNum[strNum.length-2] != 1) {
    ordinal = "nd";
  }else if (strNum[strNum.length-1] == 3 && strNum[strNum.length-2] != 1) {
    ordinal = "rd";
  } else {
    ordinal = "th";
  }
  return name + ", you are the " + num + ordinal +" customer we serve today. Thank you!"
  //throw new Error('Remove this line and implement the function');
};
