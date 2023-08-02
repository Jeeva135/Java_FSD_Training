import isPrime from "../src/numbers.js";
import { assert } from "chai";

const num1=7;
const num2=10;


describe('test cases for isPrime()', ()=>{
    it('should return true if number is prime',()=>{
        assert.equal(isPrime(num1),true)
    })
    it('should return false if number is not prime',()=>{
        assert.equal(isPrime(num2),false)
    })
})