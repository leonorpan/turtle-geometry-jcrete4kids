(reset)

(def FLAKE_SIZE 10)

(defn writeLeafParticle[num, turnFunc]
   (turnFunc)
   (forward num)
   (pen-up)
   (backward num)
   (pen-down))  

(defn drawSnowflakeLeaf[size]
  (forward size)
  (writeLeafParticle size #(left 45))
  (writeLeafParticle size #(right 45))
  (writeLeafParticle size #(right 45))
  (left 45)
  (backward size))

(rep 6
  (drawSnowflakeLeaf FLAKE_SIZE)
  (left 60))